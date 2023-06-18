import java.util.ArrayList;

public class Lecturer {
    private Staff lec;
    private ArrayList<Course> selectedCourse;
    
    public Lecturer() {
        lec = new Staff();
    }

    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
        this.selectedCourse = new ArrayList<Course>();
    }

    public String getName() {
        return lec.name;
    }

    public String getLectID() {
        return lec.staffId;
    }

    public Staff getLect() {
        return lec;
    }

    public ArrayList<Course> getSelectedCourse() {
        return selectedCourse;
    }
}

