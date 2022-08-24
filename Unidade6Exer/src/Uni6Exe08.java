import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        int inteiroN;
        String str = "";
        String stringIntermediaria = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite um número inteiro n: ");
            inteiroN = input.nextInt();
        } while (inteiroN > 20);

        double vetor[] = new double[inteiroN];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            str += Double.toString(vetor[i]) + " ";
        }

        System.out.println("Valor \t Frequência");
        do {
            int qtd = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (qtd == 0 && str.indexOf(Double.toString(vetor[i])) != -1) {
                    stringIntermediaria = Double.toString(vetor[i]);
                    qtd++;
                } else if (stringIntermediaria.equals(Double.toString(vetor[i])) 
                && str.indexOf(Double.toString(vetor[i])) != -1) {
                    qtd++;
                }
            }
            str = str.replace(stringIntermediaria, "").trim();
            System.out.println(stringIntermediaria + "\t" + qtd);
        } while (!str.isEmpty());
    
        input.close();
    }
}
