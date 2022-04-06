import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do Marquinhos: ");
        int idadeM = input.nextInt();

        System.out.print("Digite a idade do Zezinho: ");
        int idadeZ = input.nextInt();

        System.out.print("DIgite a idade da Luluzinha: ");
        int idadeL = input.nextInt();

        if (idadeM < idadeL && idadeM < idadeZ) {
            System.out.println("Marquinhos é o caçula");
        } else {
            if (idadeL < idadeM && idadeL < idadeZ) {
                System.out.println("Luluzinha é a caçula");
            } else {
            System.out.println("Zezinho é o caçula");
            }
        }
        
        input.close();
    }
}
