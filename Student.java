/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author Muhamad Fahdy
 */
public class Student {


    private String name;
    private String id;
    private double gpa;
    private Professor advisor;
   

    public Student(String nama, String id, double gpa){
        this.name = name;
        this.id=id;
        this.gpa=gpa;
    }

    public Student() {
        
    }
    
    public Student(String nama){
    
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public Professor getAdvisor() {
        return advisor;
    }
    
//    public void display(){
//        System.out.println(getName()+" "+getId() +" "+ getAdvisor().getName()+" "+ getAdvisor().getId());
//    }
//       public void display(String note){
//        System.out.println(note +" "+getName()+" "+getId() +" "+ getAdvisor().getName()+" "+ getAdvisor().getId());
//    }
//     
//     public String display(String note,String memo){
//        System.out.println(note +" "+memo+getName()+" "+getId() +" "+ getAdvisor().getName()+" "+ getAdvisor().getId());
//        return "Contoh metode non-void";
//    }

}
