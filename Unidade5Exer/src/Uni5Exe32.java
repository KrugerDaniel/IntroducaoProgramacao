import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        boolean continuar = true;
        String semana = "";
        int dias = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o p: ");
        int p = input.nextInt();

        System.out.print("Digite o n: ");
        int n = input.nextInt();

        while (continuar) {
            for (int i = 1; i < 8; i++) {
                if (i >= p) {
                    semana = semana + " " + dias;
                    dias++;
                    p = 0;
                } else {
                    semana = semana + "  ";
                }
                if (dias > n) {
                    continuar = false;
                    break;
                }
            }
            System.out.println(semana);
            semana = "";
        }

        input.close();
    }
}
