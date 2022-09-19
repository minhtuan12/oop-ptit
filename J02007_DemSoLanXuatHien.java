import java.util.Scanner;


public class J02007_DemSoLanXuatHien {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        for (int j = 1; j <= t; j++){
            int n = inp.nextInt();
            int[] a = new int[10001];
            int[] cnt = new int[10001];
            
            for (int i = 0; i < n; i++){
                a[i] = inp.nextInt();
                cnt[a[i]]++;
            }
            
            System.out.println("Test " + j + ":");
            for (int i = 0; i < n; i++){
                if (cnt[a[i]] != - 1)
                    System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                cnt[a[i]] = -1;
            }
        }
    }
}
