public class Ex2 {
    public static void main(String[] args) {
        String aluno = "Alberto Fonseca";
        String disciplina1 = "Matemática";
        String disciplina2 = "Física";
        String disciplina3 = "Química";
        double nota1 = 17.5;
        double nota2 = 14.25;
        double nota3 = 18.0;

        System.out.printf("Aluno: %s \n\n", aluno);
        System.out.printf("%-23s%4s\n", "Disciplina", "Nota");
        System.out.printf("---------------------------\n");
        System.out.printf("%-23s%4.1f\n", disciplina1, nota1);
        System.out.printf("%-23s%4.1f\n", disciplina2, nota2);
        System.out.printf("%-23s%4.1f\n", disciplina3, nota3);
    }
}
