import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o x do p1: ");
        float ponto1x = input.nextFloat();

        System.out.print("Digite o y do p1: ");
        float ponto1y = input.nextFloat();

        System.out.print("Digite o x do p2: ");
        float ponto2x = input.nextFloat();

        System.out.print("Digite o y do p2: ");
        float ponto2y = input.nextFloat();

        //  dAB² = (xB – xA)² + (yB – yA)².
        float distacia = (float) Math.sqrt((float) Math.pow(ponto2x-ponto1x, 2) + (float) Math.pow(ponto2y-ponto1y, 2));

        System.out.format("A distância entre os dois pontos é de %.4f", distacia);

        input.close();
    }
}
