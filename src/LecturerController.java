import java.util.ArrayList;

public class LecturerController {
    
    private ArrayList<Lecturer> lecturerList ;
    private ArrayList<Course> courseList ;
    private ArrayList<Course> lect = new ArrayList<Course>();
    private LecturerView lecturerView;
    private int index;

    public LecturerController(ArrayList<Lecturer> lecturerList, ArrayList<Course> courseList) {
        this.lecturerList = lecturerList;
        this.courseList = courseList;
        lecturerView= new LecturerView();
    }

    public Lecturer LectControllerMenu(){
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
            choice = lecturerView.showlectmenu(lecturerList.get(index));

            switch (choice){
                case 1: chooseTeachingCourse(lecturerView);
                break;

                case 2: removeTeachingCourse(lecturerView);
                break;

                case 3: viewSelectedTeachingCourse();
                break;

            }
        }

        return lec;
    }

    public void chooseTeachingCourse(LecturerView lecturerView){
        viewCourse();
        String temp = lecturerView.showTeachingCourse();
        //l = lecturerList.get(index);
        for (int i =0;i<courseList.size();i++){
            if(temp.equals(courseList.get(i).getCode())){
                Course course= new Course(courseList.get(i).getName(), courseList.get(i).getCode(), courseList.get(i).getCredit(), courseList.get(i).getSpace());
                //l.getTeachingCourse().add(course);
                lect.add(course);
                course.setLec(LectControllerMenu());
                lecturerView.chooseSuccessful(temp);
                //break; //to avoid always show register fail
                
            }
            else{
                lecturerView.registerfail(temp);

            }
        }
    }   

    public void removeTeachingCourse(LecturerView lecturerView){
        viewSelectedTeachingCourse();
        String temp = lecturerView.showDeleteTeachingCourse();
        //Lecturer l = lecturerList.get(index);
        for (int i =0;i<courseList.size();i++){ 
            if(temp.equals(courseList.get(i).getCode())){
                lect.remove(i);
                lecturerView.removeSuccessful(temp);
                
            }
            else{
                lecturerView.removefail(temp);
                
            }
        }   
    }

    public void viewSelectedTeachingCourse(){
        
        lecturerView.displayTeachingCourse(lect);

    } 

    public void viewCourse(){
        lecturerView.displayCourseList(courseList);
    } 
}
