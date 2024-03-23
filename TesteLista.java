public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);

        for(int i=1; i<6; i++){
            lista.insereInicio(i*10);
            System.out.println(lista);
        }

        for(int i=1; i<6; i++){
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }

        if(lista.estaVazia()){
            System.out.println("Lista Vazia. Não há o que remover.");
        }
        else{
            System.out.println(lista.removeInicio() + " foi removido do inicio.");
            System.out.println(lista);
        }
    }
}
