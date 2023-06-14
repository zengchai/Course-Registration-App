import java.util.*;

public class StudentView {
    Scanner sc = new Scanner(System.in);
     int choice;

    public Student confirmStudent(){
        System.out.println("\nPlease enter your name");
        String name = sc.nextLine();
        System.out.println("\nPlease enter your matric id");
        String id = sc.nextLine();
        return new Student(name, id);
    }

    public int showstumenu(Student student){
        System.out.println("\n\nWelcome to the course registration system! "+student.getName());
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Register Course");
        System.out.println("[2] Drop Course");
        System.out.println("[3] View Course");
        System.out.println("[4] Exit");
        System.out.print("\nChoice: ");
        choice = sc.nextInt();
        return choice;
    }

    public String showRegisterCourse(){
        System.out.println("\nRegister course: ");
        System.out.println("Enter course name: ");
        String Cname=sc.nextLine();
        return Cname;
    }
    
    public String showDeleteCourse(){
        System.out.println("\nDelete course: ");
        System.out.println("Enter course name: ");
        String Cname=sc.nextLine();
        return Cname;
    }

    public void removefail(String n){
        System.out.println(n + "is not a valid course name");
    }

    public void registersuccess(){
        System.out.println("Register Successful !");
    }

    public void registerfail(String n){
        System.out.println(n + "is not a valid course name");
    }

    public void displayCourseList(ArrayList<Course> c){
        System.out.println("\nAvailable Course List");
        System.out.printf("\n%-30s%-10s%-7s%-7s\n","Course Name","Code","Credit","Capity");
        System.out.printf("%-30s%-10s%-7s%-7s\n","-----------","----","------","------");
        for (int i=0;i<c.size();i++){
            System.out.printf("%-30s%-10s%-7s%-7s\n",c.get(i).getName(),c.get(i).getCode(),c.get(i).getCredit(),c.get(i).getSpace());
        }
    }

    public void validateTrue(String n){
        System.out.println(n + " is selected");

    }

}


