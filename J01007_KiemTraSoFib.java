import java.util.Scanner;


public class J01007_KiemTraSoFib {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            Long n = inp.nextLong();
            long f0 = 0, f1 = 1, fn = f0 + f1;
            while (fn < n){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            if (fn == n || n == 0)
                System.out.println("YES");           
            else
                System.out.println("NO");
      }
   }
}