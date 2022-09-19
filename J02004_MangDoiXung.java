import java.util.Scanner;


public class J02004_MangDoiXung {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            int n = inp.nextInt();
            int[] a = new int[n];
            boolean ok = true;
            
            for (int i = 0; i < n; i++)
                a[i] = inp.nextInt();
            for (int i = 0; i < n / 2; i++)
                if (a[i] != a[n - i - 1])
                    ok = false;
            
            if (!ok)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
