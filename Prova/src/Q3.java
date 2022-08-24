import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipos = input.next().toUpperCase().trim().charAt(0);

        if (tipos == 'A') {
            System.out.println("Vermelho");
        } else if (tipos == 'B') {
            System.out.println("Azul");
        } else if (tipos == 'O') {
            System.out.println("Universal");
        } else {
            System.out.println("Tipo Inconsistente");
        }

        input.close();
    }
}
