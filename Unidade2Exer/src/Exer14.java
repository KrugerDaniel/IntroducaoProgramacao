import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor: ");

        int valor = input.nextInt();

        int cem = valor / 100;
        valor -= cem * 100;

        int cinquenta = valor / 50;
        valor -= cinquenta * 50;

        int vinte = valor / 20;
        valor -= vinte * 20;

        int dez = valor / 10;
        valor -= dez * 10;

        int cinco = valor / 5;
        valor -= cinco * 5;

        int dois = valor / 2;
        valor -= dois * 2;

        System.out.format("Precisará de: %d notas de 100, %d notas de 50, %d notas de 20, ", cem, cinquenta, vinte);
        System.out.println("");
        System.out.format("%d notas de 10, %d notas de 5, %d notas de dois e %d notas de um", dez, cinco, dois, valor);

        input.close();
    }
}
