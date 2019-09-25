/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

/**
 *
 * @author DIDI
 */
public abstract class Professor2 extends Teacher {
    private String name;
    private String employessID;
    private ArrayList teachingAssigmrnts;
    
    @Override
    public boolean agreeToTeach(Course c){
        return false;
    }
    
    @Override
    public void designateTextbook(TextBook b, Course c){
        
    }
    @Override
    public Syllabus defineSyllabus(Course c){
        return null;
     }
    @Override
    public boolean approveEnrollment(Student s, Course c){
        return false;
    }
}
