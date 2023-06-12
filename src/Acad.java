import java.util.Scanner;

public class Acad {
    private Staff aca;
    private Course [] c;
    private int count;
    public Acad(String n, String i){
        this.aca = new Staff(n, i);
        this.count = 0;
        this.c = new Course[10];
    }
    public void creatCourse(){
        System.out.println("\n\nCreating Course");
        System.out.println("\nCourse Details: ");
        Scanner sin = new Scanner(System.in);
        System.out.print("Name: ");
        String z = sin.nextLine();
        System.out.print("Code: ");
        String w = sin.nextLine();
        System.out.print("Credit: ");
        int x = sin.nextInt();
        System.out.print("Capacity: ");
        int a = sin.nextInt();
        c[count] = new Course(z,w,x,a);
        count++;
    }

    public void removeCourse(){
        count--;
    }

    public void viewCourse(){
        System.out.println("\n\nAvailable Course List");
        for (int i=0;i<count;i++){
            System.out.println("\nCourse " + (i+1) + "\n");
            System.out.println(c[i].toString());
        }
    }

    public Course searchCourse(String co){
        for (int i=0;i<count;i++){
            if(c[i].getCode().equals(co)){
                return c[i];
            }
        }
        return null;
    }

    public String getName() {
        return aca.getName();
    }

    public void setlec(Lecturer z,String a){
        this.searchCourse(a).setLec(z);
    }

    
    public void viewLec(Lecturer l){
        int i =0;
        for (int z=0;z<count;z++){
            if(this.c[z].getLec().equals(l.getName())){
                System.out.println("\nCourse " + (i+1) + "\n");
                System.out.println(c[z].toString());
                i++;}
            }
    }    
}   
