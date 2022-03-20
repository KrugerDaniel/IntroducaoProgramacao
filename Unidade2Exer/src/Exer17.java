import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = input.nextLine();

        System.out.print("Digite o números de horas: ");
        float horas = input.nextFloat();

        System.out.print("Digite o número de dependentes: ");
        int dependentes = input.nextInt();

        float salarioBruto = horas * 10 + 60 * dependentes;

        float salarioLiquido = salarioBruto - (salarioBruto * 0.085f + salarioBruto * 0.05f);
        
        System.out.format("O funcionário %s terá o salário bruto de %.2f e um salário líquido de %.2f", nome, salarioBruto, salarioLiquido);

        input.close();
    }
}
