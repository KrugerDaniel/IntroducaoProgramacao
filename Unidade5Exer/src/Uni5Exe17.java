import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        double baixo;
        double alto = 0;
        double alturaTotal = 0;

        int inscriAlto = 0;
        int inscriBaixo = 0;
        int qtd = 0;

        Scanner input= new Scanner(System.in);

        int inscricao = input.nextInt();
        double altura = input.nextInt();

        baixo = altura;

        while (inscricao != 0) {
            if (alto < altura) {
                inscriAlto = inscricao;
                alto = altura;
            }
            if (baixo > altura) {
                inscriBaixo = inscricao;
                baixo = altura;
            }

            alturaTotal += altura;
            qtd++;

            inscricao = input.nextInt();

            if (inscricao == 0) {
                break;
            }

            altura = input.nextInt();
        }

        System.out.println("Número " + inscriAlto + " é o mais alto com " + alto);
        System.out.println("Número " + inscriBaixo + " é o mais baixo com " + baixo);
        System.out.println("A altura média é de " + ((double) alturaTotal / qtd));

        input.close();
    }
}
