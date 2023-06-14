import java.util.ArrayList;
import java.util.Scanner;

public class AcadView {
    Scanner sin;

    public AcadView(Scanner sc){
        this.sin = sc;
    }

    public void createdCourse(String code){
        System.out.println("\nCourse "+ code +" has been created successfully!");
    }
    
    public void removedCourse(String code){
        System.out.println("\nCourse "+ code +" has been removed successfully!");
    }

    public void addedStudent(String code){
        System.out.println("\nStudent "+ code +" has been created successfully!");
    }

    public void addedLecturer(String code){
        System.out.println("\nLecturer "+ code +" has been created successfully!");
    }

    public Course displaycreatCourse(){
        System.out.println("\n\nCreating Course");
        System.out.println("\nCourse Details");
        sin.nextLine();
        System.out.printf("%-8s%-2s","Name",":");
        String z = sin.nextLine();
        System.out.printf("%-8s%-2s","Code",":");
        String w = sin.nextLine();
        System.out.printf("%-8s%-2s","Credit",":");
        int x = sin.nextInt();
        System.out.printf("%-8s%-2s","Capacity",":");
        int a = sin.nextInt();
        this.createdCourse(w);
        return new Course(z,w,x,a);
    }

    public void requestProceed(){
        sin.nextLine();
        System.out.print("\nKindly enter any number to proceed: ");
        String z = sin.nextLine();
    }

    public void displayCourseList(ArrayList<Course> c){

        System.out.println("\nAvailable Course List");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int i=0;i<c.size();i++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",c.get(i).getName(),c.get(i).getCode(),c.get(i).getLec().getName(),c.get(i).getCredit(),c.get(i).getSpace());
        }
    }

    public String displayRemoveCourse(ArrayList<Course> c){
        System.out.println("\n\nRemoving Course");
        this.displayCourseList(c);
        sin.nextLine();
        System.out.print("\nEnter the code that you want to remove: ");
        String z = sin.nextLine();
        this.removedCourse(z);
        return z;
    }
    
    public int showAcadMenu(Acad acad){
        System.out.println("\n\nWelcome to the course registration system, " + acad.getAca().getName());
        System.out.println("\nKindly select the activity:");
        System.out.println("[1] Create Course");
        System.out.println("[2] Remove Course");
        System.out.println("[3] View Course List");
        System.out.println("[4] Add Student");
        System.out.println("[5] Add Lecturer");
        System.out.println("[6] Exit");
        System.out.print("\nNumber: ");
        int s = sin.nextInt();
        return s;
    }

    public Acad checkAcad(){
        System.out.print("Log in\n");
        sin.nextLine();
        System.out.print("Enter Username: ");
        String u = sin.nextLine();
        System.out.print("Enter Staffid: ");
        String s = sin.nextLine();
        System.out.print("Enter Password: ");
        String p = sin.nextLine();
        return new Acad(u, s, p);
    }

    public Student createStudent(){
        System.out.println("\n\nAdding Student");
        System.out.println("\nStudent personal Information ");
        sin.nextLine();
        System.out.printf("%-10s%-2s","Name",":");
        String z = sin.nextLine();
        System.out.printf("%-10s%-2s","Matric ID",":");
        String w = sin.nextLine();
        this.addedStudent(w);
        Student stu = new Student(z,w);
        return stu;   
    }

    public Lecturer createLecturer(){
        System.out.println("\n\nAdding Lecturer");
        System.out.println("\nLecturer personal Information ");
        sin.nextLine();
        System.out.printf("%-10s%-2s","Name",":");
        String z = sin.nextLine();
        System.out.printf("%-10s%-2s","Staff ID",":");
        String w = sin.nextLine();
        this.addedLecturer(w);
        Lecturer stu = new Lecturer(z,w);
        return stu;   
    }
}
