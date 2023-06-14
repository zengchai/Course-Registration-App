public class Lecturer {
    private Staff lec;
<<<<<<< HEAD
    
    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
        
=======
    private ArrayList<Course> teachingCourse;
   private int courseCount;
    
    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
        this.teachingCourse = new ArrayList<Course>();
        courseCount=teachingCourse.size();
>>>>>>> main
    }
    
    public String getName() {
        return lec.getName();
    }

    public Lecturer() {
        this.lec = new Staff();
    }

<<<<<<< HEAD

=======
    public int getCourseCount() {
        return courseCount;
    }
    
    public ArrayList<Course> getTeachingCourse() {
        return teachingCourse;
    }
>>>>>>> main

}

