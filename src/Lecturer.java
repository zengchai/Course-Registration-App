import java.util.ArrayList;

public class Lecturer {
    private Staff lec;
<<<<<<< HEAD
    private ArrayList<Course> teachingCourse;
    private int courseCount;
=======
    //private ArrayList<Course> teachingCourse;
   //private int courseCount;
>>>>>>> 60bfcb9fe44ab4068718dc8711f7eef32e3b9bf2
    
    public Lecturer() {
        this.lec = new Staff();
    }
    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
        //this.teachingCourse = new ArrayList<Course>();
        //courseCount=teachingCourse.size();
    }

    public String getName() {
        return lec.getName();
    }

    /*public int getCourseCount() {
        return courseCount;
    }*/
    
    /*public ArrayList<Course> getTeachingCourse() {
        return teachingCourse;
    }*/

}

