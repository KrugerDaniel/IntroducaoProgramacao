import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        double altura;
        double total = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            altura = input.nextDouble();

            total += altura;
        }

        double media = total / 20;

        System.out.println(media);

        input.close();
    }
}
