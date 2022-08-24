public class Uni5Exe02 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                par += i;
            } else {
                impar += i;
            }
        }

        System.out.println("Soma dos números pares: " + par);
        System.out.println("Soma dos números ímpares: " + impar);
    }
}
