import java.util.Scanner;

// (2 + 1) * 2 = 6  || (6 + 1) * 2 = 14 || (6 + 1) * 2 = 30

public class Uni5Exe05 {
    public static void main(String[] args) {
        int step = 2;
        int valor = 8;

        Scanner input = new Scanner(System.in);

        int qtd = input.nextInt();

        if (qtd > 2) {
            for (int i = 0; i < qtd; i++) {
                System.out.println(valor);

                if (i % 2 == 0) {
                    valor += 2;
                } else {
                    step = (step + 1) * 2;
                    valor += step;
                }
            }
        }

        input.close();
    }
}
