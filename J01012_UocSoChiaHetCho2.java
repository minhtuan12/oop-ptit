import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        while (t-- > 0){
            int cnt = 0;
            Long n = inp.nextLong();
            if (n % 2 != 0){
                System.out.println(0);
                continue;
            }
            
            for (Long i = 2L; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    if (i % 2 == 0)
                        cnt++;
                    if ((n / i) % 2 == 0)
                        cnt++;
                    if (i == Math.sqrt(n))
                        cnt--;
                }
            }
            System.out.println(cnt + 1);
        }
    }
}
