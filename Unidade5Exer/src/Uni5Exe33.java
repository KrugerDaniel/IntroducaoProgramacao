import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni5Exe33 {
    public static void main(String[] args) {
        int voto;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int votoNull = 0;
        int votoBranco = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite o voto: ");
            voto = input.nextInt();

            if (voto <= 6 && voto >= 0) {
                switch (voto) {
                    case 1:
                        voto1++;
                        break;
                    case 2:
                        voto2++;
                        break;
                    case 3:
                        voto3++;
                        break;
                    case 4:
                        voto4++;
                        break;
                    case 5:
                        votoNull++;
                        break;
                    case 6:
                        votoBranco++;
                        break;
                }
            } else {
                System.out.println("Opção incorreta");
            } 
        } while (voto != 0);

        int total = voto1 + voto2 + voto3 + voto4 + votoBranco + votoNull;

        System.out.println("Total de votos para o candidato 1: " + voto1);
        System.out.println("Total de votos para o candidato 2: " + voto2);
        System.out.println("Total de votos para o candidato 3: " + voto3);
        System.out.println("Total de votos para o candidato 4: " + voto4);
        System.out.println("Total de votos brancos: " + votoBranco);
        System.out.println("Voto nulos: " + df.format((double) votoNull / total * 100) + "%");
        System.out.println("Voto em branco: " + df.format((double) votoBranco / total * 100) + "%");

        input.close();
    }
}
