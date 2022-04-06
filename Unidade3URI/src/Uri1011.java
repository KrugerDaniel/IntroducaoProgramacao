import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1011 {
 
    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.000");
        
        Scanner input = new Scanner(System.in);
        
        double raio = input.nextDouble();
        
        double volume = 4 * 3.14159d * (raio * raio * raio) / 3;
        
        System.out.println("VOLUME = " + df.format(volume));
        
        input.close();
    }
 
}