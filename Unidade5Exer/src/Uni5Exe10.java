import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1000; i <= 9999; i++) {
            int part1 = i / 100;
            int part2 = i % 100;

            int soma = part1 + part2;

            if (Math.pow(soma, 2) == i) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
