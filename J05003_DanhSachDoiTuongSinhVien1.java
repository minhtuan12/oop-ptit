
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
class Stu {
    static int ID = 1;
    private String id;
    private String name;
    private String clas;
    private String birth;
    private double gpa;

    public Stu(String name, String clas, String birth, double gpa) {
        this.id = String.format("B20DCCN%03d", ID++);
        
        if (birth.charAt(1) == '/')
            birth = '0' + birth;
        if (birth.charAt(4) == '/')
            birth = birth.substring(0, 3) + '0' + birth.substring(3);
        this.birth = birth;
        
        String tmp = "";
        String[] a = name.trim().split("\\s+");
        for (int i = 0; i < a.length; i++){
            tmp += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if (i != a.length - 1)
                tmp += " ";
        }
        this.name = tmp;
        this.clas = clas;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("B20DCCN%03d", ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
    
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + birth + " " + String.format("%.2f", gpa);
    }
}

public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Stu> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            String name = inp.nextLine();
            String clas = inp.nextLine();
            String birth = inp.nextLine();
            Double gpa = Double.parseDouble(inp.nextLine());
            a.add(new Stu(name, clas, birth, gpa));
        }
        
        Collections.sort(a, new Comparator<Stu>(){
            @Override
            public int compare(Stu o1, Stu o2) {
                if (o1.getGpa() < o2.getGpa())
                    return 1;
                else if (o1.getGpa() > o2.getGpa())
                    return -1;
                else
                    return 0;
            }
        });
        
        for (Stu i : a)
            System.out.println(i.toString());
    }
}