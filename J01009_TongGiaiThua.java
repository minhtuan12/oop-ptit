import java.util.Scanner;


public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        long sum = 1;
        long tmp = 1;
        for (int i = 2; i <= n; i++){
            tmp = tmp * i;
            sum += tmp;
        }
        System.out.println(sum);
    }
}
