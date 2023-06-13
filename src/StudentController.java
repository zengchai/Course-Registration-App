import java.util.ArrayList;


public class StudentController {
    private ArrayList<Student> StudentList ;
    private ArrayList<Course> CourseList ;
    private StudentView studentview;
    private int index;

    public StudentController(ArrayList<Student> studentList, ArrayList<Course> courseList) {
        this.StudentList = studentList;
        this.CourseList = courseList;
        studentview= new StudentView();
    }

    public void StuControllerMenu(){

        int i =0;
        Student stu = studentview.confirmStudent();
         for (int a = 0 ; a<StudentList.size(); a++){
            if(stu.getName().equals(StudentList.get(a).getName())&&
              stu.getMatricid().equals(StudentList.get(a).getMatricid())) {
                this.index=a;
                studentview.validateTrue(stu.getName());
                break;
            }
            else{
                this.index = -1;
            }
         }

        while(i!=4 && index!=-1){
            i = studentview.showstumenu(StudentList.get(index));
            switch (i){
            case 1: RegisterCourse(studentview);
            break;

            case 2: removeCourse(studentview);
            break;

            case 3: viewCourse();
            break;
            }
        };
    }

    public void RegisterCourse(StudentView studentView){
        String temp=studentView.showRegisterCourse();
        for (int i =0;i<CourseList.size();i++){
            if(temp.equals(CourseList.get(i).getName())){
                StudentList.get(index).getRegisterCourse().add(CourseList.get(i));
                studentview.registersuccess();
            }
            else{
                studentView.registerfail(temp);
            }
        }
    }   

    public void removeCourse(StudentView studentView){
        String temp=studentView.showDeleteCourse();
        for (int i =0;i<CourseList.size();i++){ 
            if(temp.equals(CourseList.get(i).getName())){
                StudentList.get(index).getRegisterCourse().remove(i);
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
