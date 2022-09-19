import java.util.Scanner;


public class J01024_SoTamPhan {
    
    public static boolean check(String s){
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '2')
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
