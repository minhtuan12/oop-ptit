import java.util.Scanner;
import java.math.RoundingMode;

public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        if (a == 0 && b != 0)
            System.out.println("VN");
        else if (a == 0 && b == 0)
            System.out.println("VSN");
        else
        {
            double res = (-b) / (double)a ;
            System.out.printf("%.2f", res);
        }
    }
}
