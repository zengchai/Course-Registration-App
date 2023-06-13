import java.util.ArrayList;

public class Lecturer {
    private Staff lec;
    private ArrayList<Course> teachingCourse;
   private int courseCount;
    
    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
        this.teachingCourse = new ArrayList<Course>();
        courseCount=teachingCourse.size();
    }
    /*public void setCours(Course cours) {
        this.cours = cours;
    }*/
    public String getName() {
        return lec.getName();
    }
    public Lecturer() {
        this.lec = new Staff();
    }

    public int getCourseCount() {
        return courseCount;
    }
    
    public ArrayList<Course> getRegisterCourse() {
        return teachingCourse;
    }

}
