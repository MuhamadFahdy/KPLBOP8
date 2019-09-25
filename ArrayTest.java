package Pertemuan8;

import java.util.ArrayList;

/**
 * @author DIDI
 */
public class ArrayTest {
    public static void main(String[] args) {
        //Instansiasi
        ArrayList<Student> students = new ArrayList<Student>();
        
        //create a new Student objects
        Student a = new Student("Saya");
        Student b = new Student("Mahasiswa");
        Student c = new Student("Sukses");
        
        //Store reference to all three Student to the colllections
        students.add(a);
        students.add(b);
        students.add(c);
        
        
        //printing each Student's name
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
