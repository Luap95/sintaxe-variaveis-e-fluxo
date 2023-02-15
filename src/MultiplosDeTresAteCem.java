public class MultiplosDeTresAteCem {
    public static void main(String[] args) {
        int numero = 0;

        for(int contador = 0; contador <= 100; contador++){
            if(numero % 3 == 0){
                System.out.println(numero);
            }
            numero = contador;
        }
    }
}
