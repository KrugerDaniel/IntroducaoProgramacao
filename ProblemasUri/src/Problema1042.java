import java.util.Scanner;

public class Problema1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor1);
            if (valor2 < valor3) {
                System.out.println(valor2);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor2);
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println(valor2);
            if (valor1 < valor3) {
                System.out.println(valor1);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor1);
            }
        } else {
            System.out.println(valor3);
            if (valor2 < valor1) {
                System.out.println(valor2);
                System.out.println(valor1);
            } else {
                System.out.println(valor1);
                System.out.println(valor2);
            }
        }

        System.out.println("");

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        input.close();
    }
}
