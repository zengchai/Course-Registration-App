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
        System.out.println("Creating Course");
        System.out.println("\nCourse Details");
        String x,a;
        int xi=0,ai=0;
        boolean bool = false;
        sin.nextLine();
        System.out.printf("%-8s%-2s","Name",":");
        String z = sin.nextLine();
        System.out.printf("%-8s%-2s","Code",":");
        String w = sin.nextLine();
        do{
            try{
                System.out.printf("%-8s%-2s","Credit",":");
                x = sin.nextLine();
                xi = Integer.parseInt(x);
                bool=false;}
            catch (NumberFormatException e){
                System.out.println("Wrong format! The data must be in integers.");
                bool=true;
            }}while(bool == true);
        do{
            try{
                System.out.printf("%-8s%-2s","Capacity",":");
                a = sin.nextLine();
                ai = Integer.parseInt(a);
                bool=false;}
            catch (NumberFormatException e){
                System.out.println("Wrong format! The data must be in integers.");
                bool=true;
            }}while(bool == true);
        this.createdCourse(w);
        return new Course(z,w,xi,ai);
    }

    public void requestProceed(){
        System.out.print("\nKindly enter any number to proceed: ");
        String z = sin.nextLine();
    }

    public void displayCourseList(ArrayList<Course> c){

        System.out.println("Available Course List");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int i=0;i<c.size();i++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",c.get(i).getName(),c.get(i).getCode(),c.get(i).getLec().getName(),c.get(i).getCredit(),c.get(i).getSpace());
        }
        sin.nextLine();
    }

    public String displayRemoveCourse(ArrayList<Course> c){
        System.out.println("Removing Course");
        this.displayCourseList(c);
        //sin.nextLine();
        System.out.print("\nEnter the code that you want to remove: ");
        String z = sin.nextLine();
        return z;
    }
    
    public int showAcadMenu(Acad acad){
        System.out.println("Welcome to the course registration system, " + acad.getAca().getName());
        System.out.println("\nKindly select the activity:");
        System.out.println("[1] Create Course\n[2] Remove Course\n[3] View Course List\n[4] Add Student");
        System.out.println("[5] View Student List\n[6] Add Lecturer\n[7] Exit");
        System.out.print("\nNumber: ");
        int s = sin.nextInt();
        return s;
    }

    public Acad checkAcad(){
        System.out.println("Log in\n");
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
        System.out.println("Adding Student");
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
        System.out.println("Adding Lecturer");
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

    public void errorMessage(){
        System.out.println("\nThe information is incorrect. Please log in again.");
    }

    public void displayStu(ArrayList <Student> S){
        System.out.println("Student List");
        for (int i=0;i<S.size();i++){
        System.out.println("\nStudent " + (i+1));
        System.out.println("\nName       : " + S.get(i).getName());
        System.out.println("Matric ID  : " + S.get(i).getMatricid());
        System.out.println("Course List:");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int z=0;z<S.get(i).getRegisterCourse().size();z++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",S.get(i).getRegisterCourse().get(z).getName(),
            S.get(i).getRegisterCourse().get(z).getCode(),S.get(i).getRegisterCourse().get(z).getLec().getName(),
            S.get(i).getRegisterCourse().get(z).getCredit(),S.get(i).getRegisterCourse().get(z).getSpace());
        }
    }
        sin.nextLine();}
    
}
