import java.util.Scanner;

public class J01002_TinhTong 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner (System.in);
        int t = inp.nextInt();
        while(t > 0)
        {
            long n = inp.nextLong();
            long sum = 0;
            sum = ((1 + n) * n ) / 2;
            System.out.println(sum);
            t -= 1;
        }
    }
}