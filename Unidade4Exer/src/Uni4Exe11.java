import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento dos três irmãos: ");
        int irmao1 = input.nextInt();
        int irmao2 = input.nextInt();
        int irmao3 = input.nextInt();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("Trigêmios");
        } else {
            if (irmao1 == irmao2 || irmao2 == irmao3 || irmao3 == irmao1) {
                System.out.println("Gêmios");
            } else {
                System.out.println("Apenas irmãos");
            }
        }

        input.close();
    }
}
