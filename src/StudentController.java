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

    public void createStudentList(){
        StudentList.add(studentview.createStudent());
    }

    public void validateStudent(StudentView studentView){
        for (int i=0; i<StudentList.size();i++ ){
            String temp=studentView.confirmStudent();
            if(temp ==StudentList.get(i).getName()){
                index=i;
                System.out.println(StudentList.get(i).getName()+ " is selected");
            }
            else{
                System.out.println("Student name not found\n");
                studentView.confirmStudent();
            }
        }
    }

    public void StuControllerMenu(){
        int choice = studentview.showstumenu();
        switch (choice){
            case 1: RegisterCourse(studentview);
            break;

            case 2: removeCourse(studentview);
            break;

            case 3: viewCourse();
            break;

        }
    }

    public void RegisterCourse(StudentView studentView){
        String temp=studentView.showRegisterCourse();
        Student s = StudentList.get(index);
        for (int i =0;i<CourseList.size();i++){
            if(temp.equals(CourseList.get(i).getName())){
                Course course= CourseList.get(i);
                s.getRegisterCourse().add(course);
            }
            else{
                studentView.registerfail(temp);
            }
        }
    }   

    public void removeCourse(StudentView studentView){
        String temp=studentView.showDeleteCourse();
        Student s = StudentList.get(index);
        for (int i =0;i<s.getCourseCount();i++){ 
            if(temp.equals(s.getRegisterCourse().get(i).getName())){
                s.getRegisterCourse().remove(i);
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
