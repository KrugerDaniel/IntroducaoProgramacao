import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do curso: ");
        int numCurso = input.nextInt();

        switch (numCurso) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;

            case 2:
                System.out.println("Lincenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }

        input.close();
    }
}
