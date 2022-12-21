import java.util.Scanner;


public class J02014_DiemCanBang {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            int n = inp.nextInt();
            int[] a = new int[100001];
            int[] tmp = new int[100001];
            
            for (int i = 0; i < n; i++){
                a[i] = inp.nextInt();
                tmp[i] = 0;
            }
            
            tmp[0] = a[0];
            for (int i = 1; i < n; i++)
                tmp[i] = tmp[i - 1] + a[i];
            
            int total = tmp[n - 1];
            boolean ok = false;
            for (int i = 0; i < n; i++){
                int sumLeft = tmp[i];
                int sumRight = total - tmp[i] - a[i + 1];
                if (sumLeft == sumRight){
                    System.out.println(i + 2);
                    ok = true;
                    break;
                }
            }
            
            if (!ok)
                System.out.println("-1");
        }
    }
}
