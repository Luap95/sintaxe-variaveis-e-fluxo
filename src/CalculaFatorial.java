public class CalculaFatorial {
    public static void main(String[] args) {

        int numeroAtual = 1;

        for(int n = 1; n <= 6; n++){
            numeroAtual *= n;
            System.out.println("Fatorial de " + n + " é igual a " + numeroAtual);
        }


    }
}
