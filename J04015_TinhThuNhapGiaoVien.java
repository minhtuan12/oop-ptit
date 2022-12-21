import java.util.Scanner;


class Teacher{
    String pos;
    String sal;
    long simSal;
    String name;
    String tmpPos;
    
    Scanner inp = new Scanner(System.in);
    void inpTea(){
        tmpPos = inp.nextLine();
        tmpPos = new StringBuilder(tmpPos).insert(2, " ").toString();
        String tmp[] = tmpPos.split(" ");
        pos = tmp[0];
        sal = tmp[1];
        
        name = inp.nextLine();
        simSal = inp.nextLong();
    }
    
    long ex(){
        if (pos.matches("HT"))
            return 2000000;
        if (pos.matches("HP"))
            return 900000;
        if (pos.matches("GV"))
            return 500000;
        return 0;
    }
    
    void outp(){
        long tmp = Integer.parseInt(sal);
        long total = simSal * tmp + ex();
        System.out.print(pos + sal + " " + name + " ");
        System.out.println(String.valueOf(tmp) + " " + String.valueOf(ex()) + " " + total);
    }
}

public class J04015_TinhThuNhapGiaoVien {
    
    public static void main(String[] args) {
        Teacher a = new Teacher();
        a.inpTea();
        a.outp();
    }
}