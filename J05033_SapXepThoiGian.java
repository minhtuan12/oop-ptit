import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Time{
    private int hr, min, sec;

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return String.valueOf(hr) + " " + String.valueOf(min) + " " + String.valueOf(sec);
    }
}

public class J05033_SapXepThoiGian {
   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Time> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            int hr = inp.nextInt();
            int min = inp.nextInt();
            int sec = inp.nextInt();
            a.add(new Time(hr, min, sec));
        }
        
        
        Collections.sort(a, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getHr() == o2.getHr())
                    if (o1.getMin() == o2.getMin())
                        if (o1.getSec() < o2.getSec())
                            return -1;
                        else
                            return 1;
                    else if (o1.getMin() < o2.getMin())
                        return -1;
                    else
                        return 1;
                else if (o1.getHr() < o2.getHr())
                    return -1;
                return 1;
            }
        });
        
        for (Time i : a)
            System.out.println(i.toString());
    }
}
