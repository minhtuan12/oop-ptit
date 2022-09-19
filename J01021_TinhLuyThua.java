import java.util.Scanner;


public class J01021_TinhLuyThua {
    
    static long mod = 1000000007L;
    
    public static Long exp(Long a, Long b){
        if (b == 0)
            return 1L;
        Long x = exp(a, b / 2);
        if (b % 2 == 0)
            return (x % mod * x % mod) % mod;
        return ((x % mod * x % mod) * a )% mod;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            Long a = inp.nextLong();
            Long b = inp.nextLong();
            if (a == 0 && b == 0)
                break;
            System.out.println(exp(a, b));
        }
    }
}
