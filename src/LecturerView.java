import java.util.*;

public class LecturerView {
     int choice;

    Scanner sc;

    public LecturerView(Scanner sc){
        this.sc = sc;
    }

    public void removeSuccessful(String code){
        System.out.println("Teaching course "+ code +" has been removed successfully!");
    }

    public void chooseSuccessful(String code){
        System.out.println("Teaching course "+ code +" has been selected successfully!");
    }

    public void removefail(String n){
        System.out.println(n + " is not a valid course code");
    }

    public void registerfail(String n){
        System.out.println(n + " is not a valid course code");
    }

    public void validateTrue(String n){
        System.out.println("Lecturer " + n + " is selected");

    }

    public Lecturer confirmLecturer(){
        sc.nextLine();
        System.out.println("Log in\n");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Please enter your lecturer ID: ");
        String lectId = sc.nextLine();
        return new Lecturer(name, lectId);
    }

    public int showlectmenu(Lecturer lecturer){
        do{
            System.out.println("Welcome to the course registration system, " + lecturer.getName());
            System.out.println("\nKindly select the activity");
            System.out.println("[1] Select Course to teach");
            System.out.println("[2] Delete Teaching Course");
            System.out.println("[3] View Selected Teaching Course");
            System.out.println("[4] Exit");
            System.out.print("\nChoice: ");
            choice = sc.nextInt();
            return choice;
        }while(choice<1 || choice>4);
    }

    public String showTeachingCourse(){ //Choose teaching course
        sc.nextLine();
        System.out.println("\nChoose teaching course: ");
        System.out.print("Enter course code: ");
        String Ccode=sc.nextLine();
        System.out.println();
        return Ccode;
    }
    
    public String showDeleteTeachingCourse(){ //Delete teaching course
        sc.nextLine();
        System.out.println("\nDelete teaching course: ");
        System.out.print("Enter course code: ");
        String Ccode=sc.nextLine();
        System.out.println();
        return Ccode;
    }

    public void displayTeachingCourse(ArrayList<Course> lectList){ //show available course to teach
        System.out.println("\nSelected Teaching Course List");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int i=0;i<lectList.size();i++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",lectList.get(i).getName(),lectList.get(i).getCode(),lectList.get(i).getLec().getName(),lectList.get(i).getCredit(),lectList.get(i).getSpace());
        }
    }

    public void displayCourseList(ArrayList<Course> lectList){ //show available course to teach
        System.out.println("\nSelected Teaching Course List");
        System.out.printf("\n%-20s%-13s%-15s%-7s%-7s\n","Course Name","Code","Lecturer","Credit","Capity");
        System.out.printf("%-20s%-13s%-15s%-7s%-7s\n","-----------","----","--------","------","------");
        for (int i=0;i<lectList.size();i++){
            System.out.printf("%-20s%-13s%-15s%-7s%-7s\n",lectList.get(i).getName(),lectList.get(i).getCode(),lectList.get(i).getLec().getName(),lectList.get(i).getCredit(),lectList.get(i).getSpace());
        }
    }

    public void displayRepeatTrue(){
        System.out.println("Repeated Course Code Selection");
    }

    public void displayClash(){
        System.out.println("This Course Already Has A Lecturer");
    }

    public void requestProceed(){
        System.out.print("\nKindly enter any number to proceed: ");
        String z = sc.nextLine();
    }

    public void requestProceed2(){
        String i = sc.nextLine();
        System.out.print("\nKindly enter any number to proceed: ");
        String z = sc.nextLine();
    }

    public void errorMessage(){
        System.out.println("\nThe information is incorrect. Please log in again.");
    }

    public void errorCode(){
        System.out.println("\nPlease enter the corret course code.");
    }
}
