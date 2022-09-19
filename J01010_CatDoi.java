import java.util.Scanner;


public class J01010_CatDoi {
    
    public static String solve(String s)
    {
        int n = s.length();
        String res = "";
        boolean inValid = true;
        for (int i = 0; i < n; i++)
        {
            char c = s.charAt(i);
            if (c == '8' || c == '9' || c == '0')
                res += '0';
            else if (c == '1')
               res += '1';
            else
            {
                inValid = false;
                break;
            }
        }
        if (!inValid)
            return "-";
        else
            return res;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String a = inp.nextLine();
        while (t-- > 0){
            String s = inp.nextLine();
            String res = solve(s);
            
            if (res == "-")
                System.out.println("INVALID");
            else{
                int tmp = Integer.parseInt(res);
                if (tmp == 0)
                    System.out.println("INVALID");
                else
                    System.out.println(tmp);
            }
        }
    }
}
