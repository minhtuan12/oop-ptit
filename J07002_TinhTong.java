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
public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner inp = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (inp.hasNext()){
            String s = inp.next();
            try {
                sum += Integer.parseInt(s);
            }
            catch(NumberFormatException e){     
            }
        }
        System.out.println(sum);
    }
}
