package Pertemuan8;

public class GreduateStudent extends Student {
  private String Graduate;
  private String GraduateIntitusion;

    public GreduateStudent(String Graduate,String GraduateIntitusi){
        this.Graduate=Graduate;
        this.GraduateIntitusion = GraduateIntitusion;
    }
    
     public GreduateStudent(String name,String id,double gpa,String Graduate,String GraduateIntitusi){
        super(name,id,gpa);
        this.Graduate=Graduate;
        this.GraduateIntitusion = GraduateIntitusion;
    }

    public GreduateStudent() {
        
    }
  
    public String getGraduate() {
        return Graduate;
    }

    public String getGraduateIntitusion() {
        return GraduateIntitusion;
    }

    public void setGraduate(String Graduate) {
        this.Graduate = Graduate;
    }

    public void setGraduateIntitusion(String GraduateIntitusion) {
        this.GraduateIntitusion = GraduateIntitusion;
    }
    
}
