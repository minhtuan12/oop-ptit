
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
    private String name;
    private String id;
    private String clas;
    private double p1;
    private double p2;
    private double p3;

    public Stu(String id, String name, String clas, double p1, double p2, double p3) {
        this.name = name;
        this.id = id;
        this.clas = clas;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + String.valueOf(p1) + " " + String.valueOf(p2) + " " + String.valueOf(p3);
    }
}

public class J05031_BangDiemThanhPhan2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Stu> a = new ArrayList<>();
        
        while (n-- > 0){
            String id = inp.nextLine();
            String name = inp.nextLine();
            String clas = inp.nextLine();
            double p1 = Double.parseDouble(inp.nextLine());
            double p2 = Double.parseDouble(inp.nextLine());
            double p3 = Double.parseDouble(inp.nextLine());
            a.add(new Stu(id, name, clas, p1, p2, p3));
        }
        
        Collections.sort(a, new Comparator<Stu>(){
            @Override
            public int compare(Stu o1, Stu o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        int cnt = 1;
        for (Stu i : a){
            System.out.print(cnt);
            System.out.println(" " + i.toString());
            cnt++;
        }
    }
}