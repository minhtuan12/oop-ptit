import java.util.Scanner;


public class J01016_ChuSo4VaChuSo7 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '4' || c == '7')
                cnt++;
        }
        if (cnt == 4 || cnt == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
