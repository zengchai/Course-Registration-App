import java.util.*;

public class LecturerView {
    Scanner sc = new Scanner(System.in);
     int choice;

    /*public Student createLecturer(){
        System.out.println("\n\nNew Student");
        System.out.println("\nStudent personal Information ");
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Matric ID: ");
        String id = sc.nextLine();
        Student stu = new Student(n,id);
        return stu;   
    }*/

    public String confirmLecturer(){
        System.out.println("\nPlease enter your name");
        String name = sc.nextLine();
        return name;
    }

    public int showlectmenu(){
        do{
            System.out.println("\n\nWelcome to the course registration system, " + l.getName());
            System.out.println("\nKindly select the activity");
            System.out.println("[1] Select Course to teach");
            System.out.println("[2] View Course");
            System.out.println("[3] Exit");
            System.out.print("\nChoice: ");
            choice = sc.nextInt();
            return choice;
        }while(choice<1 || choice>3);
    }

    public String showTeachingCourse(){ //Choose teaching course
        System.out.println("\nChoose teaching course: ");
        System.out.println("Enter course name: ");
        String Cname=sc.nextLine();
        return Cname;
    }
    
    public String showDeleteTeachingCourse(){ //Delete teaching course
        System.out.println("\nDelete teaching course: ");
        System.out.println("Enter course name: ");
        String Cname=sc.nextLine();
        return Cname;
    }

    public void removefail(String n){
        System.out.println(n + "is not a valid course name");
    }

    public void registerfail(String n){
        System.out.println(n + "is not a valid course name");
    }

    public void displayCourseList(ArrayList<Course> c){ //show available course to teach
        System.out.println("\nAvailable Course List");
        System.out.printf("\n%-30s%-10s%-7s%-7s\n","Course Name","Code","Credit","Capity");
        System.out.printf("%-30s%-10s%-7s%-7s\n","-----------","----","------","------");
        for (int i=0;i<c.size();i++){
            System.out.printf("%-30s%-10s%-7s%-7s\n",c.get(i).getName(),c.get(i).getCode(),c.get(i).getCredit(),c.get(i).getSpace());
        }
    }

}
