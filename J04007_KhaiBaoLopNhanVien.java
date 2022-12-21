import java.util.Scanner;

class Staff{
    String name;
    String gen;
    String birth;
    String add;
    String tax;
    String date;
    
    Scanner inp = new Scanner(System.in);
    void inpSta(){
        name = inp.nextLine();
        gen = inp.nextLine();
        birth = inp.nextLine();
        add = inp.nextLine();
        tax = inp.nextLine();
        date = inp.nextLine();
    }
    
    void outpSta(){
        System.out.println("00001 " + name + " " + gen + " " + birth
                            + " " + add + " " + tax + " " + date);
    }
}
public class J04007_KhaiBaoLopNhanVien {
    
    public static void main(String[] args) {
        Staff a = new Staff();
        a.inpSta();
        a.outpSta();
    }
}
