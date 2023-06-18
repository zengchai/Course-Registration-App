import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LecturerController {
    
    private ArrayList<Lecturer> lecturerList ;
    private ArrayList<Course> courseList ;
    private LecturerView lecturerView;
    private int index;
    Lecturer lec;

    public LecturerController(ArrayList<Lecturer> lecturerList, ArrayList<Course> courseList, Scanner z) {
        this.lecturerList = lecturerList;
        this.courseList = courseList;
        lecturerView= new LecturerView(z);
    }

    public void LectControllerMenu(){
        clrscr();
        int choice = 0;
        lec = lecturerView.confirmLecturer();

         for (int a = 0 ; a<lecturerList.size(); a++){
            if(lec.getLect().getName().equals(lecturerList.get(a).getLect().getName())&&
            lec.getLect().getstaffId().equals(lecturerList.get(a).getLect().getstaffId())) {
                this.index=a;
                lecturerView.validateTrue(lec.getName());
                break;
            }
            else{
                this.index = -1;
            }
         }
         if(index == -1)
         {
            lecturerView.errorMessage();
            lecturerView.requestProceed();
         }

         while(choice!=4 && index!=-1){
            clrscr();
            choice = lecturerView.showlectmenu(lecturerList.get(index));

            switch (choice){
                case 1:  
                clrscr();
                this.chooseTeachingCourse();
                lecturerView.requestProceed();
                break;

                case 2: 
                clrscr();
                this.removeTeachingCourse();
                lecturerView.requestProceed();
                break;

                case 3: 
                clrscr();
                this.viewSelectedTeachingCourse();
                lecturerView.requestProceed2();
                break;
            }
        }
    }

    public void chooseTeachingCourse(){
        lecturerView.displayTeachingCourse(courseList);
        String temp = lecturerView.showTeachingCourse();
        boolean repeat = false;
        boolean clash = false;
        int z = 0;
        int r = 0;
        
            for(int i=0;i<courseList.size();i++)
            {  
                if (temp.equals(courseList.get(i).getCode()))
                {
                    if (!courseList.get(i).getLec().getName().equals(""))
                    {
                        if (lecturerList.get(index).getSelectedCourse().size()==0)
                        { 
                            clash = true;
                            lecturerView.displayClash();
                            r = 0;
                            break;
                        }
                    }
                }
                else
                {
                    r = 1;
                }
            }
            if (r == 1)
            {
                for(int s=0;s<lecturerList.get(index).getSelectedCourse().size();s++)
                    { 
                        if (temp.equals(lecturerList.get(index).getSelectedCourse().get(s).getCode()))
                        {
                            repeat = true;
                            lecturerView.displayRepeatTrue();
                            break;
                        }
                    }  
            }
            
                

        

        if(repeat == false && clash == false){
            for (int i =0;i<courseList.size();i++){
                if(temp.equals(courseList.get(i).getCode())){
                    lecturerList.get(index).getSelectedCourse().add(courseList.get(i)); //inside lect will have teached course
                    courseList.get(i).setLec(lecturerList.get(index)); //set teaching lec name
                    lecturerView.chooseSuccessful(temp);
                    z = 0;
                    break;
                }
                else{
                    z = 1;
                }
            }
            if(z==1){
                lecturerView.registerfail(temp);
            }
        }
    }   

    public void removeTeachingCourse(){
        viewSelectedTeachingCourse();
        String temp = lecturerView.showDeleteTeachingCourse();
        int z = 0;

        for (int i =0;i<courseList.size();i++){ 
            if(temp.equals(courseList.get(i).getCode())){
                lecturerList.get(index).getSelectedCourse().remove(courseList.get(i));
                lecturerView.removeSuccessful(temp);
                courseList.get(i).setLec(new Lecturer());; //set teaching lec name
                z = 0;
                break;
            }
            else{
                z = 1;
            }
        }
        
        if (z == 1){
            lecturerView.removefail(temp);
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

