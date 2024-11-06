import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    public enum Jogada { PEDRA, PAPEL, TESOURA}

    // vamos demonstrar até o uso de um enumerado para o resultado do jogo
    public enum Resultado { EMPATE, VITORIA_PC, VITORIA_HUMANO }

    public static void main(String[] args) {
        // Gerar jogada computador
        Random rand = new Random();
        Jogada jogadaPC = Jogada.values()[ rand.nextInt(3) ];

        // Obter jogada do jogador
        int indexJogada = obterJogada() - 1; //passar de [1,3] -> [0,2]
        Jogada jogadaHumano = Jogada.values()[ indexJogada ];

        Resultado resultado = Resultado.EMPATE; //assumir empate, verificar outros resultados
        switch (jogadaHumano) {
            case PEDRA:
                switch(jogadaPC) {
                    case PAPEL: resultado = Resultado.VITORIA_PC; break;
                    case TESOURA: resultado = Resultado.VITORIA_HUMANO;
                }
                break;
            case PAPEL:
                switch(jogadaPC) {
                    case PEDRA: resultado = Resultado.VITORIA_HUMANO; break;
                    case TESOURA: resultado = Resultado.VITORIA_PC;
                }
                break;
            case TESOURA:
                switch(jogadaPC) {
                    case PEDRA: resultado = Resultado.VITORIA_PC; break;
                    case PAPEL: resultado = Resultado.VITORIA_HUMANO; break;
                }
        }

        System.out.println("Resultado = " + resultado);

        if(resultado == Resultado.VITORIA_HUMANO) {
            System.out.println("\tPARABÉNS!!! \uD83C\uDF89");
        }

        System.out.println("Jogada PC = " + jogadaPC);
        System.out.println("Jogada Humano = " + jogadaHumano);
    }

    public static int obterJogada() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.print("Jogada (1 - Pedra, 2 - Papel, 3 - Tesoura) ?: ");

            try {
                opcao = scanner.nextInt();
            } catch(Exception e) {
                System.out.println("[Erro]");
                scanner.nextLine(); //precisamos "consumir" o que não foi 'número'.
                                    //isto limpa o buffer de entrada, senao vamos entrar
                                    //num ciclo infinito. Pode remover esta instrução e
                                    //verificar.
                opcao = 0; // forçar nova leitura
            }

        } while(opcao < 1 || opcao > 3);

        scanner.close();

        return opcao;
    }
}
