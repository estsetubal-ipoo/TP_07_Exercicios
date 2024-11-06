public class Ex3 {

    /*
    Para resolvermos este exercício, teremos de observar a tabela de precedências
    presente neste bloco de slides correspondente.
    Em qualquer uma das expressões, a atribuição será sempre a última operação a
    ser efetuada.


    int resultado = 10 + 3 * 2 - 8 / 4;

        1. Multiplicação/Divisão (associatividade esquerda)
        2. Soma/subtração (associatividade esquerda)

        10 + [3 * 2] - [8 / 4];
        [10 + 6] - 2
        = 14

    ----

    int valor = 15 - 5 * 3 + (6 / 2) * 4;

        1. Qualquer expressão em parentises terá se maior precedencia (associatividade esquerda)
        2. Seguem-se as precendencias aritméticas "normais"

        15 - 5 * 3 + 3 * 4
        15 - [5 * 3] + 3 * 4
        15 - 15 + [3 * 4]
        [15 - 15] + 12
        = 12

    ----

    boolean status = 5 > 3 && 8 < 12 || 6 == 5;

        1. As expressões aritméticas têm precedência sobre as lógicas, embora neste
           caso não haja expressões aritméticas. A conjunção (&&) tem maior precedencia
           relativamente à disjunção (||), mas os operadores de comparação tem maior
           precedencia.

           5 > 3 && 8 < 12 || 6 == 5
           [true && true] || false
           true || false
           = true

     ----

     boolean status = 5 > 3 - 1 && (8 < 12 || 6 == 5);

        1. Idem, relativamente às observações das expressões anteriores.

         5 > 3 - 1 && (true || false)
         5 > [3 - 1] && true
         5 > 2 && true
         true && true
         = true

     */

    public static void main(String[] args) {
        int resultado = 10 + 3 * 2 - 8 / 4;
        System.out.println("Resultado = " + resultado);

        int valor = 15 - 5 * 3 + (6 / 2) * 4;
        System.out.println("Valor = " + valor);

        boolean status = 5 > 3 && 8 < 12 || 6 == 5;
        System.out.println("Status (1) = " + status);

        boolean status2 = 5 > 3 - 1 && (8 < 12 || 6 == 5);
        System.out.println("Status (2) = " + status2);
    }
}
