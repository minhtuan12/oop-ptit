/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
      Scanner inp = new Scanner(new File("DATA.in"));
      while (inp.hasNextLine()){
          String s = inp.nextLine();
          System.out.println(s);
      }
   }
}
