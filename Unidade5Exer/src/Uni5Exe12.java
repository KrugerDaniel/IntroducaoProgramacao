import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        int inicio = 1;

        String floyd = "";

        Scanner input = new Scanner(System.in);

        int linhas = input.nextInt();

        for (int i = 1; i < (linhas + 1); i++) {
            for (int j = 0; j < i; j++) {
                floyd = floyd + " " + inicio;
                inicio++;
            }
            System.out.println(floyd);
            floyd = "";
        }

        input.close();
    }
}
