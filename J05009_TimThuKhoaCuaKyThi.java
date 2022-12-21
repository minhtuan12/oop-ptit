
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
class Can {
    static int ID = 1;
    private int id;
    private String name;
    private String birth;
    private double total;

    public Can(String name, String birth, double a, double b, double c) {
        this.id = ID++;
        this.name = name;
        this.birth = birth;
        this.total = a + b + c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + birth + " " + total;
    }  
}

public class J05009_TimThuKhoaCuaKyThi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Can> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            String name = inp.nextLine();
            String birth = inp.nextLine();
            double d = Double.parseDouble(inp.nextLine());
            double b = Double.parseDouble(inp.nextLine());
            double c = Double.parseDouble(inp.nextLine());
            a.add(new Can(name, birth, d, b, c));
        }
        
        Collections.sort(a, new Comparator<Can>(){
            @Override
            public int compare(Can o1, Can o2) {
                if (o1.getTotal() == o2.getTotal()){
                    if (o1.getId() < o2.getId())
                        return -1;
                    else 
                        return 1;
                }
                else if (o1.getTotal() > o2.getTotal())
                    return -1;
                else
                    return 1;
            }
        });
        
        int cnt = 1;
        for (int i = 0; i < n - 1; i++){
            if (a.get(i).getTotal() == a.get(i + 1).getTotal())
                cnt ++;
        }
        
        for (int i = 0; i < cnt; i++){
            System.out.println(a.get(i).toString());
        }
    }
}

