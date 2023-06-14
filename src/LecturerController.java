import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LecturerController {
    
    private ArrayList<Lecturer> lecturerList ;
    private ArrayList<Course> courseList ;
    private LecturerView lecturerView;
    private int index;

    public LecturerController(ArrayList<Lecturer> lecturerList, ArrayList<Course> courseList, Scanner z) {
        this.lecturerList = lecturerList;
        this.courseList = courseList;
        lecturerView= new LecturerView(z);
    }

    public void LectControllerMenu(){
        clrscr();
        int choice = 0;
        Lecturer lec = lecturerView.confirmLecturer();
         for (int a = 0 ; a<lecturerList.size(); a++){
            if(lec.getName().equals(lecturerList.get(a).getName())&&
            lec.getLectID().equals(lecturerList.get(a).getLectID())) {
                this.index=a;
                lecturerView.validateTrue(lec.getName());
                break;
            }
            else{
                this.index = -1;
            }
         }

         while(choice!=4 && index!=-1){
            clrscr();
            choice = lecturerView.showlectmenu(lecturerList.get(index));

            switch (choice){
                case 1:  
                clrscr();
                this.chooseTeachingCourse(lecturerView);
                lecturerView.requestProceed();
                break;

                case 2: 
                clrscr();
                this.removeTeachingCourse(lecturerView);
                lecturerView.requestProceed();
                break;

                case 3: 
                clrscr();
                this.viewSelectedTeachingCourse();
                lecturerView.requestProceed();
                break;

            }
        }
    }

    public void chooseTeachingCourse(LecturerView lecturerView){
        lecturerView.displayTeachingCourse(courseList);
        String temp = lecturerView.showTeachingCourse();
        boolean repeat = false;
        boolean clash = false;

        for(int i=0;i<lecturerList.get(index).getSelectedCourse().size();i++)
        { 
            if (temp.equals(lecturerList.get(index).getSelectedCourse().get(i).getCode()))
            {
                repeat = true;
                lecturerView.displayRepeatTrue();
            }
        }

        for(int i=0;i<lecturerList.get(index).getSelectedCourse().size();i++)
        { 
            if (!(lecturerList.get(index).getSelectedCourse().get(i).getLec().getName().equals(courseList.get(i).getLec().getName())))
            {
                clash = true;
                lecturerView.displayClash();
            }
        }

        if(repeat == false && clash == false){
            for (int i =0;i<courseList.size();i++){
                if(temp.equals(courseList.get(i).getCode())){
                    lecturerList.get(index).getSelectedCourse().add(courseList.get(i)); //inside lect will have teached course
                    courseList.get(i).setLec(lecturerList.get(index)); //set teaching lec name
                    lecturerView.chooseSuccessful(temp);
                
                }
                else{
                    lecturerView.registerfail(temp);

                }
            }
        }
    }   

    public void removeTeachingCourse(LecturerView lecturerView){
        viewSelectedTeachingCourse();
        String temp = lecturerView.showDeleteTeachingCourse();

        for (int i =0;i<courseList.size();i++){ 
            if(temp.equals(courseList.get(i).getCode())){
                lecturerList.get(index).getSelectedCourse().remove(courseList.get(i));
                lecturerView.removeSuccessful(temp);

            }
            else{
                lecturerView.removefail(temp);
            }
        }   
    }

    public void viewSelectedTeachingCourse(){
        lecturerView.displayTeachingCourse(lecturerList.get(index).getSelectedCourse());

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

}

