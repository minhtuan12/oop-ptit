import java.util.Scanner;

class Student{
    String name;
    String birth;
    double point1, point2, point3;
    
    Scanner inp = new Scanner(System.in);
    void inpStu(){
        name = inp.nextLine();
        birth = inp.nextLine();
        point1 = inp.nextDouble();
        point2 = inp.nextDouble();
        point3 = inp.nextDouble();
    }
    
    double sum(){
        return point1 + point2 + point3;
    }
    
    void outpStu(){
        System.out.println(name + " " + birth + " " + sum());
    }
}

public class J04005_KhaiBaoLopThiSinh {
    
    public static void main(String[] args) {
        Student a = new Student();
        a.inpStu();
        a.outpStu();
    }
}