import java.util.Scanner;


public class J01006_TinhSoFibonacci {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        long[] f = new long[93];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= 92; i++)
            f[i] = f[i - 1] + f[i - 2];
        
        while (t > 0){
            int n = inp.nextInt();
            System.out.println(f[n]);
            t--;
        }
    }
}