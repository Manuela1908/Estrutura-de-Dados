public class ListaComUltimo extends Lista{
    private No ultimo;
    //construtor padrão

    @Override

    public void insereInicio(int i){
        No novo = new No(i);

        if(estaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    
    }
    @Override
    public void insereFim(int i) {
        No novo = new No(i);

        if(estaVazia()) {
            super.setPrimeiro(novo);
        } else {
            ultimo.setProximo(novo); 
        }

        ultimo = novo; 

    }

    public int removeInicio(){
        int temp = super.getPrimeiro().getInfo();
        super.setPrimeiro(super.getPrimeiro().getProximo());
        if(estaVazia()){ //esvaziou a lista
            ultimo = null;
        }
        return temp;
    }
    }
    
