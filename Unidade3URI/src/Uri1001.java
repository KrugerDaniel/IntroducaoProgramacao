import java.util.Scanner;

public class Uri1001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();

        System.out.println("X = " + (valor1 + valor2));

        input.close();
    }
}
