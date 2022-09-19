import java.util.Scanner;


public class J02011_SapXepChon {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[101];
        
        for (int i = 0; i < n; i++)
            a[i] = inp.nextInt();
        
        int pos = -1;
        int cnt = 1;
        for (int i = 0; i < n - 1; i++){
            pos = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[pos])
                    pos = j;
            }
            int tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
            
            System.out.print("Buoc " + cnt + ": ");
            for (int k = 0; k < n; k++)
                System.out.print(a[k] + " ");
            cnt++;
            System.out.println("");
        }
    }
}
