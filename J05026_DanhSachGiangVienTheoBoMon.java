
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
class Lectures {

    static int ID = 1;
    private String id;
    private String name;
    private String sub;

    public Lectures(String name, String sub) {
        this.name = name;

        String[] a = sub.split("\\s+");
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            tmp += a[i].substring(0, 1).toUpperCase();
        }
        this.sub = tmp;
        this.id = String.format("GV%02d", ID++);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("GV%02d", ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sub;
    }
}

public class J05026_DanhSachGiangVienTheoBoMon {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Lectures> a = new ArrayList<>();

        while (n-- > 0) {
            String name = inp.nextLine();
            String sub = inp.nextLine();
            a.add(new Lectures(name, sub));
        }

        int q = Integer.parseInt(inp.nextLine());
        String tmp = "";
        while (q-- > 0) {
            String query = inp.nextLine();
            String[] b = query.split("\\s+");
            for (int i = 0; i < b.length; i++) {
                tmp += b[i].substring(0, 1).toUpperCase();
            }
        
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (Lectures i : a) {
                if (i.getSub().equals(tmp)) {
                    System.out.println(i.toString());
                }
            }
            tmp = "";
        }
    }
}
