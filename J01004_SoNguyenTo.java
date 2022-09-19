import java.util.Scanner;

public class J01004_SoNguyenTo {
    
    public static boolean prime(Long n){
        if (n < 2)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t > 0)
        {
            Long n = inp.nextLong();
            if (prime(n))
                System.out.println("YES");
            else
                System.out.println("NO");
            t -= 1;
        }
    }
}
