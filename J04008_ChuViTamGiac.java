import java.util.Scanner;

class Point{
    double x, y;
    
    Scanner inp = new Scanner(System.in);
    void inpPo(){
        x = inp.nextDouble();
        y = inp.nextDouble();
    }
    
    double distance(Point a, Point b){
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
    }
    
    boolean check(Point a, Point b, Point c){
        double m = distance(a, b);
        double n = distance(a, c);
        double q = distance(b, c);
        
        return (m + n > q || m + q > n || q + n > m);
    }
}

public class J04008_ChuViTamGiac {
    
    public void main(String[] args) {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        if (!check(a, b, c))
            
    }
}
