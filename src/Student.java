public class Student {
   private String name;
   private String matricid;
   private Course [] c;
   private int courseCount;

public Student(String name, String matricid) {
    this.name = name;
    this.matricid = matricid;
    this.c = new Course[6];
    courseCount = 0;
}

public void setCours(Course ca){
    this.c[courseCount] = ca;
    System.out.println(ca.getCode() + " has been addded successfully.");
    courseCount++;
}

public String getName() {
    return name;
}
public void removeCours(){
    courseCount--;
}

public void viewCourse(){
    for (int i =0;i<courseCount;i++){
        System.out.println("Course " + i+1 + "\n");
        System.out.println(c[i].toString());
    }
}    
}
