import java.util.Scanner;


public class J01026_SoChinhPhuong {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            int n = inp.nextInt();
            int tmp = (int) Math.sqrt(n);
            if (tmp * tmp == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
