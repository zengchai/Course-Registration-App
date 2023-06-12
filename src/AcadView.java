import java.util.ArrayList;
import java.util.Scanner;

public class AcadView {
    Scanner sin = new Scanner(System.in);

    public Course displaycreatCourse(){
        System.out.println("\n\nCreating Course");
        System.out.println("\nCourse Details: ");
        System.out.print("Name: ");
        String z = sin.nextLine();
        System.out.print("Code: ");
        String w = sin.nextLine();
        System.out.print("Credit: ");
        int x = sin.nextInt();
        System.out.print("Capacity: ");
        int a = sin.nextInt();
        return new Course(z,w,x,a);
    }

    public void displayCourseList(ArrayList<Course> c){

        System.out.println("\n\nAvailable Course List");
        for (int i=0;i<c.size();i++){
            System.out.println("\nCourse " + (i+1) + "\n");
            System.out.println(c.get(i).toString());
        }
        
    }
}
