import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor: ");

        double valor = input.nextDouble();

        int cem = (int) valor / 100;
        valor -= cem * 100;

        int cinquenta = (int) valor / 50;
        valor -= cinquenta * 50;

        int vinte = (int) valor / 20;
        valor -= vinte * 20;

        int dez = (int) valor / 10;
        valor -= dez * 10;

        int cinco = (int) valor / 5;
        valor -= cinco * 5;

        int dois = (int) valor / 2;
        valor -= dois * 2;

        int um = (int) valor / 1;
        valor -= um;

        valor *= 100;

        int zeroCinco = (int) valor / 50;
        valor -= zeroCinco * 50;

        int zeroDois = (int) valor / 25;
        valor -= zeroDois * 25;

        int zeroUm = (int) valor / 10;
        valor -= zeroUm * 10;

        int zeroZeroCinco = (int) valor / 5;
        valor -= zeroZeroCinco * 5;

        int zeroZeroUm = (int) valor / 1;

        System.out.format("Precisará de: %d notas de 100, %d notas de 50, %d notas de 20, \n", cem, cinquenta, vinte);
        System.out.format("%d notas de 10, %d notas de 5, %d notas de dois, %d notas de um, \n", dez, cinco, dois, um);
        System.out.format("%d moedas de 50, %d moedas de 25, %d moedas de 10, \n", zeroCinco, zeroDois, zeroUm);
        System.out.format("%d moedas de 5, %d moedas de 1", zeroZeroCinco, zeroZeroUm);

        input.close();
    }
}
