public class Teste1{
    public static void main(String[] args){
        int n = 5;
        NossoVetor v1 = new NossoVetor(n);
        //NossoVetor v2 = new NossoVetor(n);
        
        System.out.println("Última posição depois do construtor: " + v1.getUltPos());
        System.out.println("Dados depois do construtor: " + v1);

        /*v1.setUltPos(10);
        System.out.println("Última posição depois do set: " + v1.getUltPos());
        v1.getDados()[v1.getUltPos()] = 23;
        System.out.println("Nosso vetor depois do set: " + v1);*/

        if(v1.adiciona(100)){
           System.out.println("Elemento inserido com sucesso");
        }
        else{
            System.out.println("Está cheio.");
        }
    }
}