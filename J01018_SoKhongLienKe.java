import java.util.Scanner;


public class J01018_SoKhongLienKe {
    
    public static boolean check(String s){
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++){
            sum += s.charAt(i) - '0';
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2)
                return false;
        }
        sum += s.charAt(s.length() - 1) - '0';
        if (sum % 10 != 0)
            return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        while (t-- > 0){
            String s = inp.nextLine();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}