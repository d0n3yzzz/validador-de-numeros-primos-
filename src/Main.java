import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer quantos números? ");
        int quantidade = scan.nextInt();
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite o número: ");
            int numero = scan.nextInt();

            boolean ehPrimo = true;

            if (numero <= 1) {
                ehPrimo = false;
            } else {
                int limite = (int) Math.sqrt(numero);

                for (int j = 2; j <= limite; j++) {
                    if (numero % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                System.out.println(numero + " é primo ");
            } else {
                System.out.println(numero + " esse numero é beta ");
            }
        }




    }
}