public class Uni5Exe22 {
    public static void main(String[] args) {
        double adicional = 2000 * 0.015;

        int ano = 1996;

        while (ano != 2022) {
            adicional *= 2;
            ano++;
        }

        System.out.println("Salário atual R$" + (2000 + adicional));
    }
}
