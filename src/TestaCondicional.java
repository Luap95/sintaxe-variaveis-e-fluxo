public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 17;
        int quantidadePessoas = 1;
        if (idade >= 18){
            System.out.println("você é maior de idade");
            System.out.println("seja bem-vindo");
        } else {
            if (quantidadePessoas >= 2){
                System.out.println("você é menor de idade, mas pode entrar, " +
                        "pois está acompanhado");
            } else{
                System.out.println("você não é maior de idade");
                System.out.println("infelizmente você não pode entrar");
            }

        }
    }
}
