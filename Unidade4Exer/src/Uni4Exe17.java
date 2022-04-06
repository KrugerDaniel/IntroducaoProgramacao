import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe17 {
    public static void main(String[] args) {
        double imposto;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a renda anual: ");
        double rendaAnual = input.nextDouble();

        System.out.print("Informe o número de dependentes: ");
        int dependentes = input.nextInt();

        double rendaLiquida = rendaAnual - rendaAnual * (0.02d * dependentes);

        if (rendaLiquida <= 2000) {
            imposto = 0;
        } else if (rendaLiquida < 5000) {
            imposto = rendaLiquida - rendaLiquida * 0.05d;
        } else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida - rendaLiquida * 0.1d;
        } else {
            imposto = rendaLiquida - rendaLiquida * 0.15d;
        }

        System.out.println("Imposto: R$ " + df.format(imposto));

        input.close();
    }
}
