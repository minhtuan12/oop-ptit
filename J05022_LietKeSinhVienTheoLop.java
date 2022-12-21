
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
class Stu {
    private String id;
    private String name;
    private String clas;
    private String mail;

    public Stu(String id, String name, String clas, String mail) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + clas + " " + mail;
    }
}

public class J05022_LietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = Integer.parseInt(inp.nextLine());
        ArrayList<Stu> a = new ArrayList<>();

        while (n-- > 0) {
            String id = inp.nextLine();
            String name = inp.nextLine();
            String clas = inp.nextLine();
            String mail = inp.nextLine();
            a.add(new Stu(id, name, clas, mail));
        }
        
        int q = Integer.parseInt(inp.nextLine());
        while (q-- > 0){
            String query = inp.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + query + ": ");
            for (Stu i : a){
                if (i.getClas().equals(query))
                    System.out.println(i.toString());
            }
        }
    }
}
