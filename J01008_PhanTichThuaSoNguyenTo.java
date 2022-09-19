import java.util.Scanner;


public class J01008_PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int k = 1;
        while (t-- > 0){
            int n = inp.nextInt();
            int tmp = n;
            int cnt = 0;
            System.out.print("Test " + k + ": ");
            for (int i = 2; i <= Math.sqrt(tmp); i++){
                while (tmp % i == 0){
                    cnt++;
                    tmp /= i; 
                }
                if (cnt != 0)
                    System.out.print(i + "(" + cnt + ") ");
                cnt = 0;
            }
            if (tmp > 1)
                System.out.print(tmp + "(1)");
            System.out.println();
            k++;
        }
        
    }
}
