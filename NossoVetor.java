public class NossoVetor{
    private int ultPos;
    private int[] dados;

    public NossoVetor(int capacidade){
        ultPos = -1;
        dados = new int[capacidade];
    }
    //metodos de acesso
    public int getUltPos(){
        return ultPos;
    }
    public int[] getDados(){
        return dados;
    }
    @Override 
    public String toString(){
        String s = "";
        for(int i = 0; i <ultPos; i++){
            s = s + dados[i] + " ";
        }

        return s + "\n";
    }

    public boolean estaCheio(){
        return ultPos == dados.length - 1;
    }
    public boolean estaVazio(){
        return ultPos == -1;
    }

    public boolean adiciona(int e){
        if(estaCheio()){
            return false;
        }
        else{
            ultPos++;
            dados[ultPos] = e;
            return true;
        }
    }
    public int remove(){
       if(estaVazio()){
        return -1;
       }
       else{
        int aux = dados[ultPos];
        ultPos--;
        return aux;
       }
    }
}
