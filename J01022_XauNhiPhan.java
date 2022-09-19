import java.util.Scanner;

public class J01022_XauNhiPhan {
    
    static String[] x = new String[93];
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        x[1] = "1";
        x[2] = "1";
        for (int i = 3; i <= 92; i++)
            x[i] = x[i - 2] + x[i - 1];
        
        int t = inp.nextInt();
        while (t-- > 0){
            int n = inp.nextInt();
            int k = inp.nextInt();
            System.out.println(x[n].charAt(k));
        }
    }
}
