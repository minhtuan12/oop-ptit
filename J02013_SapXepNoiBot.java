import java.util.Scanner;


public class J02013_SapXepNoiBot {
    
    public static boolean check(int a[], int n){
        for (int i = 0; i < n - 1; i++)
            if (a[i] > a[i + 1])
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[100];
        
        for (int i = 0; i < n; i++)
            a[i] = inp.nextInt();
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - 1; j++){
                if (a[j + 1] < a[j]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            System.out.print("Buoc " + String.valueOf(i + 1) + ": ");
            for (int k = 0; k < n; k++)
                System.out.print(a[k] + " ");
            System.out.println("");
            if (check(a, n))
                break;
        }
    }
}
