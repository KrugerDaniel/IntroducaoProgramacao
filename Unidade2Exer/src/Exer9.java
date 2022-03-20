import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de dólares: ");
        float dolar = input.nextFloat();

        float cotacaoDolar = 5.06f;

        float real = dolar * cotacaoDolar;

        System.out.println("R$" + real);

        input.close();
    }
}
