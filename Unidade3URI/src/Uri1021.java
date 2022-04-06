import java.util.Scanner;

public class Uri1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valor = input.nextFloat();

        valor *= 100;

        float nota = valor / 100;

        float moeda = valor % 100;

        int nota100 = (int) nota / 100;
        nota %= 100;

        int nota50 = (int) nota / 50;
        nota %= 50;

        int nota20 = (int) nota / 20;
        nota %= 20;

        int nota10 = (int) nota / 10;
        nota %= 10;

        int nota5 = (int) nota / 5;
        nota %= 5;

        int nota2 = (int) nota / 2;
        nota %= 2;

        int nota1 = (int) nota;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        int moeda50 = (int) moeda / 50;
        moeda %= 50;

        int moeda25 = (int) moeda / 25;
        moeda %= 25;

        int moeda10 = (int) moeda / 10;
        moeda %= 10;

        int moeda5 = (int) moeda / 5;
        moeda %= 5;

        int moeda1 = (int) moeda;

        System.out.println("MOEDAS:");
        System.out.println(nota1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");

        input.close();
    }
}
