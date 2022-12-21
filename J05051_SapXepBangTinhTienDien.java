
import static java.lang.Math.round;
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
class Tab {
    static int ID = 1;
    private String id;
    private String type;
    private int heSo;
    private int bill;
    private double extra;
    private int total;

    public Tab(String type, int old, int neww) {
        this.id = String.format("KH%02d", ID++);
        this.type = type;
        if (type.equals("KD"))
            this.heSo = 3;
        else if (type.equals("NN"))
            this.heSo = 5;
        else if (type.equals("TT"))
            this.heSo = 4;
        else if (type.equals("CN"))
            this.heSo = 2;
        
        int tmp = neww - old;
        this.bill = tmp * this.heSo * 550;
        if (tmp < 50)
            this.extra = 0;
        else if (tmp >= 50 && tmp <= 100){
            this.extra = this.bill * 0.35;
            if ((tmp * this.heSo) % 2 == 0)
                this.extra = (int) this.extra;
            else
                this.extra = (int) this.extra + 1;
        }
        else if (tmp > 100)
            this.extra = this.bill;
        
        this.total = (int) (this.bill + this.extra);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("KH%02d", ID++);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return id + " " + String.valueOf(heSo) + " " + String.valueOf(bill) + " " + String.valueOf((int) extra) + " " + String.valueOf(total);
    }
}

public class J05051_SapXepBangTinhTienDien {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Tab> a = new ArrayList<>();
        
        while (n-- > 0) {
            String type = inp.nextLine();
            int old = Integer.parseInt(inp.nextLine());
            int neww = Integer.parseInt(inp.nextLine());
            a.add(new Tab(type, old, neww));
        }
        
        Collections.sort(a, new Comparator<Tab>(){
            @Override
            public int compare(Tab o1, Tab o2) {
                if (o1.getTotal() < o2.getTotal())
                    return 1;
                else if (o1.getTotal() > o2.getTotal())
                    return -1;
                return 0;
            }
        });
        
        for (Tab i : a)
            System.out.println(i.toString());
    }
}