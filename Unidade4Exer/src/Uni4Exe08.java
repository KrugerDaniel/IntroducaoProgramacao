import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        String letra = input.next().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i")
        || letra.equals("o") || letra.equals("u")) {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }

        input.close();
    }
}
