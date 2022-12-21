import java.util.Scanner;

class Student{
    String name;
    String classs;
    String birth;
    double gpa;
    
    Scanner inp = new Scanner(System.in);
    void inpStu(){
        name = inp.nextLine();
        classs = inp.nextLine();
        birth = inp.nextLine();
        gpa = inp.nextDouble();
    }
    
    String solve(){
        if (birth.charAt(1) == '/')
            birth = new StringBuilder(birth).insert(0, "0").toString();
        if (birth.charAt(4) == '/')
            birth = new StringBuilder(birth).insert(3, "0").toString();
        return birth;
    }
    
    void outpStu(){
        System.out.print("B20DCCN001 " + name + " " + classs + " " + solve() + " ");
        System.out.printf("%.2f\n", gpa);
    }
}

public class J04006_KhaiBaoLopSinhVien {
    
    public static void main(String[] args) {
        Student a = new Student();
        a.inpStu();
        a.outpStu();
    }
}