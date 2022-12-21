import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Item{
    static int ID = 1;
    private String id;
    private String name;
    private String unit;
    private int buy;
    private int sell;

    public Item(String name, String unit, int buy, int sell) {
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.id = String.format("MH%03d", ID++);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = String.format("MH%03d", ID++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + String.valueOf(buy) + " " + String.valueOf(sell) + " " + String.valueOf(sell - buy);
    }
}
        
public class J05081_DanhSachMatHang {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Item> items = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            String name = inp.nextLine();
            String unit = inp.nextLine();
            int buy = Integer.parseInt(inp.nextLine());
            int sell = Integer.parseInt(inp.nextLine());
            items.add(new Item(name, unit, buy, sell));
        }
        
        Collections.sort(items, new Comparator<Item>(){
            @Override
            public int compare(Item o1, Item o2) {
                int pro1 = o1.getSell() - o1.getBuy();
                int pro2 = o2.getSell() - o2.getBuy();
                if (pro1 > pro2)
                    return -1;
                else if (pro1 < pro2)
                    return 1;
                else
                    return 0;
            }
        });
        
        for (Item i : items)
            System.out.println(i.toString());
    }
}
