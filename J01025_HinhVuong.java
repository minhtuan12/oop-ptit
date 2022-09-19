import java.util.Scanner;


public class J01025_HinhVuong {
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a1 = inp.nextInt();
        int a2 = inp.nextInt();
        int b1 = inp.nextInt();
        int b2 = inp.nextInt();
        int c1 = inp.nextInt();
        int c2 = inp.nextInt();
        int d1 = inp.nextInt();
        int d2 = inp.nextInt();
        
        int tmp1 = Math.min(a1, c1);
        int tmp2 = Math.max(b1, d1);
        int edge1 = tmp2 - tmp1;
        
        tmp1 = Math.min(a2, c2);
        tmp2 = Math.max(b2, d2);
        int edge2 = tmp2 - tmp1;
        
        int edge = Math.max(edge1, edge2);
        System.out.println(edge * edge);
    }
}
