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
    public static void showaamenu(Acad a){
        System.out.println("\n\nWelcome to the course registration system, " + a.getName());
        System.out.println("\nKindly select the activity");
        System.out.println("[1] Create Course");
        System.out.println("[2] Remove Course");
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
        Acad a = new Acad("Admin A", "S12A2");
        Lecturer l = new Lecturer("Abdullah", "S33W1");
        Student s = new Student("Loy", "A21ES0223");
        Scanner z = new Scanner(System.in);
        int w,y,ys,yss;
        do{
        showmenu();
        w = z.nextInt();
        if (w==1){
            do{
            showstumenu(s);
            y = z.nextInt();
            if (y==1){
                a.viewCourse();
                System.out.print("\nKindly enter the course code that you want to register:");
                z.nextLine();
                String k = z.nextLine();
                if(a.searchCourse(k)!=null){
                s.setCours(a.searchCourse(k));}
                else{
                    System.out.println("Sorry, we can't find any course for that code.");
                }
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
            do{
            showaamenu(a);
            ys = z.nextInt();
            if(ys == 1){
                a.creatCourse();
            }
            if(ys == 2){
                System.out.print("The last added course has been deleted");
                a.removeCourse();
            }
            if(ys == 3){
                a.viewCourse();
            }}while(ys!=4);
        }
        if(w==3){
            do{
            showlecmenu(l);
            yss = z.nextInt();
            if(yss == 1){
                a.viewCourse();
                System.out.print("\nEnter the course code that you want to select:");
                z.nextLine();
                String d = z.nextLine();
                l.setCours(a.searchCourse(d));
                a.setlec(l,d);
            }
            if(yss == 2){
                a.viewLec(l);
            }}while(yss!=3);
            
        }
    }while(w!=4);

        }
}
