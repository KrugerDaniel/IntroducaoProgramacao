import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char palavra = input.next().toUpperCase().charAt(0);

        switch (palavra) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
        }

        input.close();
    }
}
