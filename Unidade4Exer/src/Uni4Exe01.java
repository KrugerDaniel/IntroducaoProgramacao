import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhadas no mês: ");
        int horasMes = input.nextInt();

        System.out.print("Entre com o valor pago por hora: ");
        double horasValor = input.nextDouble();

        double salarioTotal =  horasMes * horasValor;

        if (horasMes > 160) {
            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }
        
        System.out.println("O salário total é: " + salarioTotal);

        input.close();
    }
}