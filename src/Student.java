import java.util.ArrayList;

public class Student {
   private String name;
   private String matricid;
   private ArrayList<Course> RegisterCourse;

public Student(String name, String matricid) {
    this.name = name;
    this.matricid = matricid;
    this.RegisterCourse = new ArrayList<Course>();
}

public String getName() {
    return name;
}

public String getMatricid() {
    return matricid;
}

public ArrayList<Course> getRegisterCourse() {
    return RegisterCourse;
}

}

