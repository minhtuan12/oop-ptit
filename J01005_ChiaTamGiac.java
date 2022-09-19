import java.util.Scanner;
import java.lang.Math;

public class J01005_ChiaTamGiac {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t > 0){
            int n = inp.nextInt();
            int h = inp.nextInt();
            double eachArea = (1.0 / 2 * h) / n;
            for (int i = 1; i < n; i++) 
                System.out.printf("%6f ", (double)h * Math.sqrt(((double)i) / n));
            System.out.println("");
            t--;
        }
    }
}