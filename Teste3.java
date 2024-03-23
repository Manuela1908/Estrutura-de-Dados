public class Teste3 {
    public static void main(String[] args){
        NossoVetor v = new NossoVetor(5);
        for(int i=1;1<=100;i++){
            v.adiciona(i);
            System.out.println("capacidade = " + v.getDados().length);
            
        }
    }
}
