package Pertemuan8;

/**
 *
 * @author DIDI
 */
public abstract class Course {
    private String courseName;
    private String corseNumber;
    private int creditValue;
    private ArrayList enrolledStudent;
    private Professor instructor;
    
    //other detail omited
    
    public void enrolledStudent(Student s){
        enrolledStudent.add(s);
    }
    
    public void assignInstruktor(Professor p){
        instructor = p;
    }
    
    public void establishCourseSchedule(String starDate, String endDate){
     
    }
}
