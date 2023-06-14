import java.util.ArrayList;
import java.io.IOException;

public class AController {
    int index;
    ArrayList<Acad> acadList;
    ArrayList<Course> courseList;
    ArrayList<Lecturer> lecList;
    ArrayList<Student> stuList;
    AcadView acadView;

    public AController(ArrayList<Acad> acadList, ArrayList<Course> courseList,ArrayList<Student> stuList, ArrayList<Lecturer> lecList) {
        this.acadList = acadList;
        this.courseList = courseList;
        this.stuList = stuList;
        this.lecList = lecList;
        acadView = new AcadView();
    }

    public void displayMenu(){
        int i = 0;
        Acad z = acadView.checkAcad();
        for (int a = 0 ; a<acadList.size(); a++){
            if((z.getAca().getName().equals(acadList.get(a).getAca().getName())) &&
            (z.getAca().getstaffId().equals(acadList.get(a).getAca().getstaffId())) &&
            (z.getPassword().equals(acadList.get(a).getPassword()))){
                this.index = a;
                break;
            }
            else{
                this.index = -1;
            }
        }
        while(i!=6 && index!=-1){
            i = acadView.showAcadMenu(acadList.get(index));
            if(i == 1){
                this.creatCourse();
            }
            if(i == 2){
                this.removeCourse();
            }
            if(i == 3){
                this.viewCourse();
                acadView.requestProceed();
            }
            if(i == 4){
                this.createStudentList();
            }
            if(i == 5){
                this.createLectureList();
            }
        };
    }

    public void creatCourse(){
        Course c = acadView.displaycreatCourse();
        courseList.add(c);
    }

    public void viewCourse(){
        acadView.displayCourseList(courseList);
    }

    public void removeCourse(){
        String s = acadView.displayRemoveCourse(courseList);
        for (int i=0;i<courseList.size();i++){
            if(s.equals(courseList.get(i).getCode())){
                courseList.remove(i);
            }
        }
    }

    public void createStudentList(){
        this.stuList.add(acadView.createStudent());
    }

    public void createLectureList(){
        this.lecList.add(acadView.createLecturer());
    }
}