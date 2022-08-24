public class Uni5Exe21 {
    public static void main(String[] args) {
        int anos = 0;

        double chico = 1.5;
        double ze = 1.1;

        while (chico > ze) {
            anos++;
            chico += 0.2;
            ze += 0.3;
        }

        System.out.println("Levaria " + anos + " anos");
    }
}
