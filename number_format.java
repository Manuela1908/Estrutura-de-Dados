import java.util.Random;
import java.text.DecimalFormat;
public class number_format {
    public static void main (String[] args){
        Random r = new Random();
        double n = r.nextDouble();
        DecimalFormat f = new DecimalFormat("0.0");
        System.out.println(f.format(n));
    }
}
