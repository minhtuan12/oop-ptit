import java.util.Scanner;

public class J01001_HinhChuNhat 
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int a, b;
        a = inp.nextInt();
        b = inp.nextInt();
        if (a <= 0 || b <= 0)
        {
            System.out.println(0);
        }
        else
        {
            int C = (a + b) * 2;
            int S = a * b;
            System.out.println(C + " " + S);
        }
    }
}