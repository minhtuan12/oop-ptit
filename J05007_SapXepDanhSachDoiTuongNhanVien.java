
import java.io.FileNotFoundException;
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

class Staff {
    static int ID = 1;
    private String id;
    private String name;
    private String gen;
    private String birth;
    private String addr;
    private String tax;
    private String date;

    public Staff(String name, String gen, String birth, String addr, String tax, String date) {
        this.name = name;
        this.gen = gen;
        this.birth = birth;
        this.addr = addr;
        this.tax = tax;
        this.date = date;
        this.id = String.format("%05d", ID++);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("%05d", ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gen + " " + birth + " " + addr + " " + tax + " " + date;
    }
}
public class J05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Staff> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String name = inp.nextLine();
            String gen = inp.nextLine();
            String birth = inp.nextLine();
            String addr = inp.nextLine();
            String tax = inp.nextLine();
            String date = inp.nextLine();
            a.add(new Staff(name, gen, birth, addr, tax, date));
        }
        
//        Collections.sort(a, new Comparator<Staff>(){
//            @Override
//            public int compare(Staff o1, Staff o2) {
//                String[] tmp = o1.getBirth().split("/");
//                String[] tmp2 = o2.getBirth().split("/");
//                if (tmp[2].equals(tmp2[2])){
//                    if (tmp[1].equals(tmp2[1]))
//                        return tmp[0].compareTo(tmp2[1]);
//                    else
//                        return tmp[1].compareTo(tmp2[1]);
//                }
//                else
//                    return tmp[2].compareTo(tmp2[2]);    
//            } 
//        });
        
        for (Staff i : a){
            System.out.println(i.toString());
        }
    }
}