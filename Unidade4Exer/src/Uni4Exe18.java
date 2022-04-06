import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe18 {
    public static void main(String[] args) {
        double valorFinal;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o dia do vencimento: ");
        int diaVencimento = input.nextInt();

        System.out.print("Informe o dia do pagamento: ");
        int diaPagamento = input.nextInt();

        System.out.print("Informa o valor da prestação: ");
        double valorPrestacao = input.nextDouble();

        if (diaVencimento >= diaPagamento) {
            valorFinal = valorPrestacao - valorPrestacao * 0.1d;
            System.out.println("Pagamento em dia!");
        } else if (diaVencimento + 5 < diaPagamento) {
            int contagemDias = diaPagamento - (diaVencimento + 5);
            valorFinal = valorPrestacao + valorPrestacao * (0.02d * contagemDias);
        } else {
            valorFinal = valorPrestacao;
        }

        System.out.println("Valor a ser pago: " + df.format(valorFinal));

        input.close();
    }
}
