public class Uni5Exe03 {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i < 101; i++) {
            soma += (double) 1 / i;
        }

        System.out.println(soma);
    }
}
