import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        String nome;
        int idade;
        int qtd20 = 0;

        String nomes = "";
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            nome = input.next();
            idade = input.nextInt();

            if (idade > 20) {
                qtd20 ++;
            } else if (idade == 18) {
                nomes = nomes + nome + " ";
            }
        }

        System.out.println("Quantidade de pessoas com mais de 20 anos: " + qtd20);
        System.out.println("Nomes das pessoas com 18 anos: " + nomes);

        input.close();
    }
}
