import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
    public static void main(String[] args) {
        double qtAdicional;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com peso da carta: ");
        double peso = input.nextDouble();

        double valorPagar = 0;

        if (peso <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = peso - 50;
            if (pesoExcedido / 20 % 1 > 0) {
                qtAdicional = ((int) pesoExcedido / 20) + 1;
            } else {
                qtAdicional = (int) pesoExcedido / 20;
            } 
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }
            /*double quantidade = (peso - 50) / 20;
            if (quantidade % 1 > 0) {
                quantidade += 1;
            } 
            preco = 0.45 + (int) quantidade * 0.45;
        } else {
            preco = 0.45;
        } */

        System.out.println("Custo do selo " + df.format(valorPagar));

        input.close();
    }
}
