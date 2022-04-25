import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema1040 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");

        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();
        double nota3 = input.nextDouble();
        double nota4 = input.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4) / 10;

        if (media >= 7) {
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno em exame.");
            
            double notaExame = input.nextDouble();

            System.out.println("Nota do exame: " + df.format(notaExame));
            
            media = (notaExame + media) / 2;

            if (media >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media Final: " + df.format(media));
        }

        input.close();
    }
}
