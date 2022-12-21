import java.util.Scanner;


class Fraction{
    private long numer, denom;
    
    public long gcd(long a, long b){
        if (b == 0) 
            return a;
        return gcd(b, a % b);
    }
    
    public void solve() {
        Scanner inp = new Scanner(System.in);
        numer = inp.nextLong();
        denom = inp.nextLong();
        long msc = gcd(numer, denom);
        numer /= msc;
        denom /= msc;
        
        System.out.println(numer + "/" + denom);
    }
}

public class J04003_PhanSo {
    
    public static void main(String[] args) {
        Fraction n = new Fraction();
        n.solve();
    }
}
