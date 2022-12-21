
import java.io.File;
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

public class J05020_SapXepSinhVienTheoLop {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inp = new Scanner(System.in);
        ArrayList<Stu> a = new ArrayList<>();

        while (inp.hasNextLine()) {
            String id = inp.nextLine();
            String name = inp.nextLine();
            String clas = inp.nextLine();
            String mail = inp.nextLine();
            a.add(new Stu(id, name, clas, mail));
        }

        Collections.sort(a, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (Stu i : a) {
            System.out.println(i.toString());
        }
    }
}
