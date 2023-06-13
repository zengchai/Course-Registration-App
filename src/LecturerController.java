import java.util.ArrayList;

public class LecturerController {
    
    private ArrayList<Lecturer> lecturerList ;
    private ArrayList<Course> CourseList ;
    private LecturerView lecturerView;
    private int index;

    public LecturerController(ArrayList<Lecturer> lecturerList, ArrayList<Course> courseList) {
        this.lecturerList = lecturerList;
        this.CourseList = courseList;
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
        int choice = lecturerView.showstumenu();
        switch (choice){
            case 1: chooseTeachingCourse(lecturerView);
            break;

            case 2: removeTeachingCourse(lecturerView);
            break;

            case 3: viewCourse();
            break;

        }
    }

    public void chooseTeachingCourse(LecturerView lecturerView){
        String temp=lecturerView.showTeachingCourse();
        Lecturer l = lecturerList.get(index);
        for (int i =0;i<CourseList.size();i++){
            if(temp.equals(CourseList.get(i).getName())){
                Course course= CourseList.get(i);
                l.getRegisterCourse().add(course);
            }
            else{
                lecturerView.registerfail(temp);
            }
        }
    }   

    public void removeTeachingCourse(LecturerView lecturerView){
        String temp=lecturerView.showDeleteTeachingCourse();
        Lecturer l = lecturerList.get(index);
        for (int i =0;i<l.getCourseCount();i++){ 
            if(temp.equals(l.getRegisterCourse().get(i).getName())){
                l.getRegisterCourse().remove(i);
            }
            else{
                studentView.removefail(temp);
            }
        }   
    }

    public void viewCourse(){
        studentview.displayCourseList(CourseList);
    } 
}
