import java.util.*;

public class StudentView {

    Scanner sc;

    public StudentView(Scanner z){
        this.sc=z;

    }

    public Student confirmStudent(){
        System.out.println("\nStudent Log in ");
        sc.nextLine();
        System.out.print("\nPlease enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your matric id: ");
        String id = sc.nextLine();
        return new Student(name, id);
    }

    public int showstumenu(Student student){
        System.out.println("\nWelcome to the course registration system! "+student.getName());
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Register Course");
        System.out.println("[2] Drop Course");
        System.out.println("[3] View Course");
        System.out.println("[4] Exit");
        System.out.print("\nChoice: ");
        int choice = sc.nextInt();
        return choice;
    }

    public String showRegisterCourse(){
        System.out.println("\nRegister course: ");
        sc.nextLine();
        System.out.print("Enter course code: ");
        String Cname=sc.nextLine();
        return Cname;
    }
    
    public String showDeleteCourse(){
        System.out.println("\nDelete course: ");
        System.out.print("Enter course code: ");
        String Cname=sc.nextLine();
        return Cname;
    }

    public void removefail(String n){
        System.out.println(n + "is not a valid course name");
    }

     public void removesuccess(){
        System.out.println("Selected course is deleted successfully");
    }

    public void registersuccess(){
        System.out.println("Register Successful !");
    }

    public void registerfail(String n){
        System.out.println(n + " is not a valid course name");
    }

    public void displayCourseList(ArrayList<Course> c){
        System.out.println("\nAvailable Course List");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int i=0;i<c.size();i++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",c.get(i).getName(),c.get(i).getCode(),c.get(i).getLec().getName(),c.get(i).getCredit(),c.get(i).getSpace());
        }
    }

    public void validateTrue(String n){
        System.out.println("Student " + n + " is selected");
    }

    public void displayStuCourse(ArrayList<Course> StuCList){
        sc.nextLine();
        System.out.println("Your Course Registration List");
        System.out.printf("\n%-30s%-10s%-7s%-7s\n","Course Name","Code","Credit","Capity");
        System.out.printf("%-30s%-10s%-7s%-7s\n","-----------","----","------","------");
        for (int i=0;i<StuCList.size();i++){
            System.out.printf("%-30s%-10s%-7s%-7s\n",StuCList.get(i).getName(),StuCList.get(i).getCode(),StuCList.get(i).getCredit(),StuCList.get(i).getSpace());
        }
    }

    public void displayRepeatTrue(){
        System.out.println("Repeated Course Code Registration");
    }

    public void requestProceed(){
        System.out.print("\nKindly enter any number to proceed: ");
        String z = sc.nextLine();
    }

    public void errorMessage(){
        System.out.println("\nStudent information is incorrect. Please log in again.");
    }

}


