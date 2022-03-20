import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância: ");
        float distancia = input.nextFloat();

        float tempo = distancia * 2;

        System.out.format("Tempo: %.2f minutos", tempo);

        input.close();
    }
}