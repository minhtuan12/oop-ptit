
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inp = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> a = new HashMap<>();
        while (inp.hasNextInt()) {
            int n = inp.nextInt();
            if (a.containsKey(n))
                a.put(n, a.get(n) + 1);
            else
                a.put(n, 1);
        }
        
        Set<Integer> res = a.keySet();
        for (Integer i : res)
            System.out.println(i + " " + a.get(i));
    }
}
