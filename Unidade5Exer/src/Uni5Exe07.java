import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        double nova;

        Scanner input = new Scanner(System.in);

        int qtd = input.nextInt();

        nova = input.nextDouble();

        double maior = nova;
        double menor = nova;

        for (int i = 0; i < (qtd - 1); i++) {
            nova = input.nextDouble();
            
            if (nova > maior) {
                maior = nova;
            } 
            if (nova < menor) {
                menor = nova;
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);

        input.close();
    }
}
