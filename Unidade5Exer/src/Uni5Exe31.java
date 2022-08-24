import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        int primo = 2;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = input.nextInt();

        while (true) {
            if (numero % primo == 0) {
                System.out.println("Decomposição: " + primo);
                break;
            } else {
                primo++;
            }
        }

        input.close();
    }
}
