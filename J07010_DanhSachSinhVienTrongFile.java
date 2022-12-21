/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class Stu {
    static int ID = 1;
    private String id;
    private String name;
    private String clas;
    private String date;
    private double gpa;

    public Stu(String name, String clas, String birth, double gpa) {
        this.id = String.format("B20DCCN%03d", ID++);
        this.name = name;
        this.clas = clas;
        
        if (birth.charAt(1) == '/')
            birth = '0' + birth;
        if (birth.charAt(4) == '/')
            birth = birth.substring(0, 3) + '0' + birth.substring(3);
        this.date = birth;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + date + " " + String.format("%.2f", gpa);
    }
    
    
}

public class J07010_DanhSachSinhVienTrongFile{
    public static void main(String[] args) throws FileNotFoundException {
        List<Stu> a = new ArrayList<>();
        Scanner inp = new Scanner(new File("SV.in"));
        while (inp.hasNextLine()) {
            int n = Integer.parseInt(inp.nextLine());
            while (n-- > 0) {
                String name = inp.nextLine();
                String clas = inp.nextLine();
                String date = inp.nextLine();
                Double gpa = Double.parseDouble(inp.nextLine());
                a.add(new Stu(name, clas, date, gpa));
            }
        }
        
        for (Stu i : a){
            System.out.println(i.toString());
        }
    }
}
