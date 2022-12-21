
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class J07021_ChuanHoaXauHoTenTrongFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inp = new Scanner(new File("DATA.in"));
        while (inp.hasNextLine()) {
            String s = inp.nextLine();
            if (s.equals("END"))
                break;
            String[] a = s.trim().split("\\s+");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
                if (i != a.length - 1) {
                    res += " ";
                }
            }
            System.out.println(res);
        }
    }
}
