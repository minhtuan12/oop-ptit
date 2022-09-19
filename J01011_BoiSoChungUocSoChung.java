import java.util.Scanner;


public class J01011_BoiSoChungUocSoChung {
    
    public static Long gcd(Long a, Long b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    public static Long lcm(Long a, Long b){
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0)
        {
            Long a = inp.nextLong();
            Long b = inp.nextLong();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}

