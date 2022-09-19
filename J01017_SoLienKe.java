import java.util.Scanner;


public class J01017_SoLienKe {
    
    public static boolean check(String s){
        for (int i = 0; i < s.length() - 1; i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i + 1));
            if (Math.abs(a - b) != 1)
                return false;
        }
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
