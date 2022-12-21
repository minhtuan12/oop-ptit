import java.util.Scanner;

class Fraction{
    long numer, denom;
    
    static Scanner inp = new Scanner(System.in);
    public void inputFrac(){
        numer = inp.nextLong();
        denom = inp.nextLong();
    }
    
    public long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    Fraction plus(Fraction b){
        Fraction res = new Fraction();
        res.numer = numer * b.denom + denom * b.numer;
        res.denom = denom * b.denom;
        long msc = gcd(res.numer, res.denom);
        res.numer /= msc;
        res.denom /= msc;
        return res;
    }
}


public class J04004_TongPhanSo {
    
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.inputFrac();
        b.inputFrac();
        Fraction res = a.plus(b);
        System.out.println(res.numer + "/" + res.denom);
    }
}
