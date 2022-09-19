import java.util.Scanner;


public class J02008_BoiSoNguyenDuongCuaNSoNguyenDuongDauTien {
    
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    public static long lcm(long a, long b){
        return (a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            int n = inp.nextInt();
            long res = 1L;
            for (long i = 2L; i <= n; i++){
                res = lcm(res, i);
            }
            
            System.out.println(res);
        }
    }
}
