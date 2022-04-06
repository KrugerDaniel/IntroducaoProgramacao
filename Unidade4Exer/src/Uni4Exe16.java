import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        int homemVelho, homemNovo, mulherVelha, mulherNova;

        Scanner input = new Scanner(System.in);

        int homem1 = input.nextInt();
        int homem2 = input.nextInt();
        int mulher1 = input.nextInt();
        int mulher2 = input.nextInt();

        if (homem1 > homem2) {
            homemVelho = homem1;
            homemNovo = homem2;
        } else {
            homemVelho = homem2;
            homemNovo = homem1;
        }
        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        System.out.println("A soma: " + (homemVelho + mulherNova));
        System.out.println("O produto: " + (homemNovo * mulherVelha));

        input.close();
    }
}
