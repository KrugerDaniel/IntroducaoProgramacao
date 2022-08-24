public class Uni5Exe04 {
    public static void main(String[] args) {
        int cima = 3;
        int baixo = 2;
        double soma = 0;
        int variado = 0;

        for (int i = 0; i < 20; i++) {
            soma += (double) cima / baixo;
            cima += 2;
            baixo += 4 + variado;
            variado += 2;
        }

        System.out.println(soma);
    }
}
