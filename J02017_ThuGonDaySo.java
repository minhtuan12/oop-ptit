import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class J02017_ThuGonDaySo {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[100001];
        List<Integer> tmp = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            a[i] = inp.nextInt();
            tmp.add(a[i]);
        }
        
        int i = 1;
        while (i < n){
            if ((tmp.get(i) + tmp.get(i - 1)) % 2 == 0){
                tmp.remove(i);
                tmp.remove(i - 1);
                i = 1;
            }
            else
                i++;
        }
        System.out.println(tmp.size());
    }
}
