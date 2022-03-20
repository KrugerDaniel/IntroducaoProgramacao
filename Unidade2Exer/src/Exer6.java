import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int numFuncionario = input.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        float numHoras = input.nextInt();

        System.out.print("Digite o valor de uma hora: ");
        float valorHoras = input.nextFloat();

        float salario = numHoras * valorHoras;

        System.out.format("O salário do funcionário %d é de R$%.2f", numFuncionario, salario);
        input.close();
    }
}
