import java.security.InvalidAlgorithmParameterException;

public class Lista {
    private No primeiro;
    //construtor padrao, zera tudo.
    public No getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro(No primeiro){
        this.primeiro = primeiro;
    }

    public boolean estaVazia(){
        return primeiro == null;
    }
    public void insereInicio(int i){
        No novo = new No(i);
        if(!estaVazia()){
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override
    public String toString(){
        String s = "Lista ";
        if(estaVazia()){
            s += "está vazia";
        }
        else{
            No aux = primeiro;
            while(aux != null){
                s += aux;
                aux = aux.getProximo();
            }
            s += "\\";
        }
        return s + "\n";
    }
    public void insereFim(int i){
        No novo = new No(i);

        if(estaVazia()){
            primeiro = novo;
        }
        else{
            No aux = primeiro;
            while(aux.getProximo() != null){ //percorre até o ultimo, e não até o final
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio(){
        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return info;
    }
}
