import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        int valorMaior, valorMenor, valorMeio;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int valor1 = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int valor2 = input.nextInt();

        System.out.print("Digite o valor 3: ");
        int valor3 = input.nextInt();

        System.out.print("Digite a opção desejada: ");
        int opcao = input.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            valorMaior = valor1;

            if (valor2 > valor3) {
                valorMeio = valor2;
                valorMenor = valor3;
            } else {
                valorMeio = valor3;
                valorMenor = valor2;
            }
        } else if (valor1 < valor2 && valor2 > valor3) {
            valorMaior = valor2;

            if (valor1 > valor3) {
                valorMeio = valor1;
                valorMenor = valor3;
            } else {
                valorMeio = valor3;
                valorMenor = valor1;
            }
        } else {
            valorMaior = valor3;

            if (valor1 > valor2) {
                valorMeio = valor1;
                valorMenor = valor2;
            } else {
                valorMeio = valor2;
                valorMenor = valor1;
            }
        }

        switch (opcao) {
            case 1:
                System.out.println(valorMenor + ", " + valorMeio + ", " + valorMaior);
                break;
            case 2:
                System.out.println(valorMaior + ", " + valorMeio + ", " + valorMenor);
                break;
            case 3:
                System.out.println(valorMenor + ", " + valorMaior + ", " + valorMeio);
                break;
        }

        input.close();
    }
}
