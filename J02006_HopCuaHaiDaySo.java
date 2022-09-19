import java.util.Scanner;


public class J02006_HopCuaHaiDaySo {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        int x;
        
        for (int i = 0; i < n; i++){
            x = inp.nextInt();
            a[x] = 1;
        }
        for (int i = 0; i < m; i++){
            x = inp.nextInt();
            b[x] = 1;
        }
            
        for (int i = 1; i <= 1000; i++)
            if (a[i] == 1 || b[i] == 1)
                System.out.print(i + " ");
   }
}
