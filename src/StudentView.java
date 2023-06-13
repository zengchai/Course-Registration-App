import java.util.*;

public class StudentView {
    Scanner sc = new Scanner(System.in);
    int choice;


    public String confirmStudent(){
        System.out.println("\nPlease enter your name");
        String name = sc.nextLine();
        return name;
    }

    public int showstumenu(){
        do{
        System.out.println("\n\nWelcome to the course registration system! " );
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Register Course");
        System.out.println("[2] Drop Course");
        System.out.println("[3] View Course");
        System.out.println("[4] Exit");
        System.out.print("\nChoice: ");
        choice = sc.nextInt();
        return choice;
        }while(choice<1 || choice>4);
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
}

