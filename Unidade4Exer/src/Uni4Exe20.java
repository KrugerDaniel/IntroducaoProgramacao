import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe20 {
    public static void main(String[] args) {
        char conceito;
        boolean situacao;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite a nota dos exercícios: ");
        double exercicios = input.nextDouble();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + exercicios) / 7;

        if (media >= 9) {
            conceito = 'A';
            situacao = true;
        } else if (media >= 7.5d) {
            conceito = 'B';
            situacao = true;
        } else if (media >= 6) {
            conceito = 'C';
            situacao = true;
        } else if (media >= 4) {
            conceito = 'D';
            situacao = false;
        } else {
            conceito = 'F';
            situacao = false;
        }

        System.out.println("Média: " + df.format(media));
        System.out.println("Conceito: " + conceito);
        
        if (situacao) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        input.close();
    }
}
