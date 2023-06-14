import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void showmenu(){
        System.out.println("Course Registration System");
        System.out.println("\nEnter the number to log-in");
        System.out.println("[1] Student");
        System.out.println("[2] Academic Office Staff");
        System.out.println("[3] Lecturer");
        System.out.println("[4] Exit");
        System.out.print("\nNumber: ");
    }

    public static void clrscr(){
    //Clears Screen in java
    try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime();
        } catch (IOException | InterruptedException ex) {}
    }

    public static void main(String[] args) throws Exception {
        ArrayList <Course> courseList = new ArrayList<>();
        ArrayList <Acad> acadList = new ArrayList<>();
        ArrayList <Lecturer> lecList = new ArrayList<>();
        ArrayList <Student> stuList = new ArrayList<>();
        Scanner z = new Scanner(System.in);
        acadList.add(new Acad("Admin A", "S23A1","pass1"));
        acadList.add(new Acad("Admin B", "S23A2","pass2"));

        //AController aController = new AController(acadList, courseList, stuList, lecList);
        //StudentController stuController = new StudentController(stuList,courseList);
        //Lecturer l = new Lecturer("Abdullah", "S33W1");
        //lecList.add(l);

        AController aController = new AController(acadList, courseList, stuList, lecList,z);
        StudentController stuController = new StudentController(stuList,courseList,z);
        LecturerController lectController = new LecturerController(lecList,courseList,z); 
        /*Lecturer l = new Lecturer("Abdullah", "S33W1");
        lecList.add(l);*/
        Student a = new Student("Loy", "ABC");
        stuList.add(a);*/


        int w;
        do{
        clrscr();
        showmenu();
        w = z.nextInt();
        if (w==1){
           stuController.StuControllerMenu();
        }
        if (w==2){
            aController.displayMenu();
        }
        if(w==3){
            lectController.LectControllerMenu();
            
        }
    }while(w!=4);

        }
}
