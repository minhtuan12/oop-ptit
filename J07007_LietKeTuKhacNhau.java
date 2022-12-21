
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
class WordSet{
    
    Set<String> res = new TreeSet<>();
    WordSet(String fname) throws FileNotFoundException {
        Scanner inp = new Scanner(new File("VANBAN.in"));
        while (inp.hasNext())
            res.add(inp.next().toLowerCase());
    }

    @Override
    public String toString() {
        String outp = "";
        for (String i : res){
            outp += i + "\n";
        }
        return outp;
    }
}


public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
        
    }
}
