import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses: ");
        int meses = input.nextInt();

        if (meses <= 12) {
            System.out.println("5% de reajuste");
        } else {
            if (meses >= 12 && meses <= 48) {
                System.out.println("7% de reajuste");
            }
        }

        input.close();
    }
}
