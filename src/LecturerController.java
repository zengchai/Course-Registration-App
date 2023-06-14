import java.util.ArrayList;

public class LecturerController {
    
    private ArrayList<Lecturer> lecturerList ;
    private ArrayList<Course> courseList ;
    private ArrayList<Course> lect = new ArrayList<Course>();
    private LecturerView lecturerView;
<<<<<<< HEAD
=======
    Lecturer l;
    private int index;
>>>>>>> main

    public LecturerController(ArrayList<Lecturer> lecturerList, ArrayList<Course> courseList) {
        this.lecturerList = lecturerList;
        this.courseList = courseList;
        lecturerView= new LecturerView();
    }

    /*public void createStudentList(){
        lecturerList.add(lecturerList.createStudent());
    }*/

    /*public void validateStudent(StudentView studentView){
        for (int i=0; i<lecturerList.size();i++ ){
            String temp=lecturerView.confirmLecturer();
            if(temp ==lecturerList.get(i).getName()){
                index=i;
                System.out.println(lecturerList.get(i).getName()+ " is selected");
            }
            else{
                System.out.println("Lecturer name not found\n");
                studentView.confirmStudent();
            }
        }
    }*/

    public void LectControllerMenu(){
        int choice = 0;
        while(choice!=4){
            choice = lecturerView.showlectmenu();

            switch (choice){
                case 1: chooseTeachingCourse(lecturerView);
                break;

                case 2: removeTeachingCourse(lecturerView);
                break;

                case 3: viewSelectedTeachingCourse();
                break;

            }
        }
    }

    public void chooseTeachingCourse(LecturerView lecturerView){
        viewCourse();
        String temp = lecturerView.showTeachingCourse();
        //l = lecturerList.get(index);
        for (int i =0;i<courseList.size();i++){
            if(temp.equals(courseList.get(i).getName())){
                Course course= new Course(courseList.get(i).getName(), courseList.get(i).getCode(), courseList.get(i).getCredit(), courseList.get(i).getSpace());
                //l.getTeachingCourse().add(course);
                lect.add(course);
                //break; //to avoid always show register fail
                
            }
            else if(temp.equals(courseList.get(i).getName())){
                lecturerView.registerfail(temp);

            }

        }
    }   

    public void removeTeachingCourse(LecturerView lecturerView){
        viewSelectedTeachingCourse();
        String temp = lecturerView.showDeleteTeachingCourse();
        //Lecturer l = lecturerList.get(index);
        for (int i =0;i<courseList.size();i++){ 
            if(temp.equals(courseList.get(i).getName())){
                lect.remove(i);
                
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
