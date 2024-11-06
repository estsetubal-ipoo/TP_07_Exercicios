import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione um produto:");
            System.out.println("1 - Café (0,70€)");
            System.out.println("2 - Chá (1,00€)");
            System.out.println("3 - Refrigerante (2,00€)");
            System.out.println("4 - Água (0,75€)");
            System.out.println("5 - Chocolate (1,50€)");
            System.out.print("Digite o código do produto: ");

            int codigo = scanner.nextInt();

            double preco = 0;
            switch(codigo) {
                case 1: preco = 0.7; break;
                case 2: preco = 1; break;
                case 3: preco = 2; break;
                case 4: preco = 0.75; break;
                case 5: preco = 1.5; break;
                default:
                    System.out.println("[Produto inexistente.]");
            }

            if(preco > 0) {
                System.out.println("Preço a pagar = " + preco);
            }

            System.out.print("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        scanner.close(); // na realidade, é boa prática fazer isto
        System.out.println("Obrigado por utilizar o sistema de vendas automáticas!");
    }
}

