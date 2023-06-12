import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void showmenu(){
        System.out.println("Course Registration Sysem");
        System.out.println("\nEnter the number to log-in");
        System.out.println("[1] Student");
        System.out.println("[2] Academic Office Staff");
        System.out.println("[3] Lecturer");
        System.out.println("[4] Exit");
        System.out.print("\nNumber: ");
    }
    public static void showstumenu(Student s){
        System.out.println("\n\nWelcome to the course registration system, " + s.getName());
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Register Course");
        System.out.println("[2] Drop Course");
        System.out.println("[3] View Course");
        System.out.println("[4] Exit");
        System.out.print("\nNumber: ");
    }
    public static void showlecmenu(Lecturer l){
        System.out.println("\n\nWelcome to the course registration system, " + l.getName());
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Select Course to teach");
        System.out.println("[2] View Course");
        System.out.println("[3] Exit");
        System.out.print("\nNumber: ");
    }
    public static void main(String[] args) throws Exception {
        ArrayList <Course> courseList = new ArrayList<>();
        ArrayList <Acad> acadList = new ArrayList<>();
        ArrayList <Lecturer> lecList = new ArrayList<>();
        ArrayList <Student> stuList = new ArrayList<>();
        acadList.add(new Acad("Admin A", "S23A1","pass1"));
        acadList.add(new Acad("Admin B", "S23A2","pass2"));
        AController aController = new AController(acadList, courseList);
        Lecturer l = new Lecturer("Abdullah", "S33W1");
        Student s = new Student("Loy", "A21ES0223");
        Scanner z = new Scanner(System.in);
        int w,y,yss;
        do{
        showmenu();
        w = z.nextInt();
        if (w==1){
            do{
            showstumenu(s);
            y = z.nextInt();
            if (y==1){
                System.out.print("\nKindly enter the course code that you want to register:");
                z.nextLine();
                String k = z.nextLine();
            }
            if (y==2){
                System.out.print("The last added course has been deleted");
                s.removeCours();
            }
            if (y==3){
                System.out.println("\n\nRegistered Course List");
                s.viewCourse();
            }}while(y!=4);
        }
        if (w==2){
            aController.displayMenu();
        }
        if(w==3){
            do{
            showlecmenu(l);
            yss = z.nextInt();
            if(yss == 1){
                System.out.print("\nEnter the course code that you want to select:");
                z.nextLine();
                String d = z.nextLine();
            }
            if(yss == 2){
            }}while(yss!=3);
            
        }
    }while(w!=4);

        }
}
