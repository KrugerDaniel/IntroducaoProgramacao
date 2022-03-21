import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número inteiro de até três digitos: ");
        int valor = input.nextInt();

        int centena = valor / 100;
        valor %= 100;

        int dezena = valor / 10;
        valor %= 10;

        int unidade = valor;

        System.out.format("%d centenas %d dezenas %d unidades", centena, dezena, unidade);

        input.close();
    }
}
