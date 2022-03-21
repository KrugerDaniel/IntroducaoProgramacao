import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe12 {
    public static void main(String[] args) {
        String nome;
        double salarioBruto, salarioLiquido, horas;
        int dependentes;

        DecimalFormat df = new DecimalFormat("#.##");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        nome = input.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas = input.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        dependentes = input.nextInt();

        salarioBruto = horas * 10 + 60 * dependentes;
        salarioLiquido = salarioBruto - (salarioBruto * 0.05f + salarioBruto * 0.085);

        System.out.println("O funcionário " + nome + "tem um salário bruto de R$ " + 
        df.format(salarioBruto) + " e um salário líquido de R$ " + df.format(salarioLiquido));

        input.close();
    }
}
