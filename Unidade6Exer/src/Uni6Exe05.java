import java.util.Scanner;

public class Uni6Exe05 {
    public Uni6Exe05() {
        Scanner input = new Scanner(System.in);

        String opiniao1[] = input(input, "Homem");
        String opiniao2[] = input(input, "Mulher");

        input.close();

        escrever(afinidade(opiniao1, opiniao2));
    }

    public String[] input(Scanner input, String sexo) {
        String opiniao[] = new String[5];

        System.out.println(sexo);
        for (int i = 0; i < 5; i++) {
            escreverFrases(i);
            opiniao[i] = input.next().trim();
        }

        return opiniao;
    }

    public void escreverFrases(int posicao) {
        String frases[] = { "Gosta de música sertaneja? ",
            "Gosta de futebol? ",
            "Gosta de seriados? ",
            "Gosta de redes sociais? ",
            "Gosta da Oktoberfest? " };

        System.out.print(frases[posicao]);
    }

    public int afinidade(String[] opiniao1, String[] opiniao2) {
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            if (opiniao1[i].equalsIgnoreCase(opiniao2[i])) {
                soma += 3;
            } else if(opiniao1[i].equalsIgnoreCase("ind") || opiniao2[i].equalsIgnoreCase("ind")) {
                soma += 1;
            } else {
                soma -= 2;
            }
        }

        return soma;
    }

    public void escrever(int soma) {
        if (soma == 15) {
            System.out.println("Casem");
        } else if (soma > 9) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (soma > 4) {
            System.out.println("Talvez não dê certo :(");
        } else if (soma >= 0) {
            System.out.println("Vale um encontro.");
        } else if (soma > -10) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
}
