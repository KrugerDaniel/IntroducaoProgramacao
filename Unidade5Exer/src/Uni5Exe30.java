import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        String printMochila = "";
        String printFora = "";
        int qtdMochila = 0;
        int qtdFora = 0;
        int somaMochila = 0;
        int somaFora = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = input.nextInt();

        System.out.print("Digite o intervalo: ");
        int intervalo = input.nextInt();

        System.out.print("Digite o tamanho da mochila: ");
        int mochila = input.nextInt();

        while (numero > 0) {
            if (numero > mochila) {
                System.out.println("Elemento que entrou na mochila: " + numero);
                if (qtdMochila == 0) {
                    printMochila = printMochila + numero;
                    qtdMochila++;
                } else {
                    printMochila = printMochila + " " + numero;
                }
                somaMochila += numero;
                numero -= intervalo;
            } else {
                if (qtdFora == 0) {
                    printFora = printFora + numero;
                    qtdFora++;
                } else {
                    printFora = printFora + " " + numero;
                }
                somaFora += numero;
                numero -= intervalo;
            }
        }

        System.out.println("Elementos que etraram na mochila: " + printMochila);
        System.out.println("Elementos ficaram fora da mochila: " + printFora);
        System.out.println("A soma dos elementos da mochila: " + somaMochila);
        System.out.println("A soma dos elementos fora: " + somaFora);

        input.close();
    }
}
