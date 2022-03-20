import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas: ");
        float latas = input.nextFloat();

        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        float garrafa600 = input.nextFloat();

        System.out.print("Digite a quantidade de garrafas de 2 litros: ");
        float litro = input.nextFloat();

        latas = latas * 350 / 1000;
        garrafa600 = garrafa600 * 600 / 1000;

        float total = (litro * 2) + garrafa600 + latas;

        System.out.println("Foi comprado " + total + " litros");

        input.close();
    }
}
