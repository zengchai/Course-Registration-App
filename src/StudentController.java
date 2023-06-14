import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentController {
    private ArrayList<Student> StudentList ;
    private ArrayList<Course> CourseList ;
    private StudentView studentview;
    private int index;

    public StudentController(ArrayList<Student> studentList, ArrayList<Course> courseList,Scanner z) {
        this.StudentList = studentList;
        this.CourseList = courseList;
        studentview= new StudentView(z);
    }

    public void StuControllerMenu(){

        int i =0;
        clrscr();
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
            clrscr();
            i = studentview.showstumenu(StudentList.get(index));
            switch (i){
            case 1: 
            clrscr();
            RegisterCourse();
            studentview.requestProceed();
            break;

            case 2: 
            clrscr();
            viewStuCourse();
            removeCourse();
            studentview.requestProceed();
            break;

            case 3: 
            clrscr();
            viewStuCourse();
            studentview.requestProceed();
            break;
            }
        };

        if(index==-1){
            studentview.errorMessage();
            studentview.requestProceed();
        }
        
    }

    public void RegisterCourse(){
        boolean repeat = false;

        studentview.displayCourseList(CourseList);
        String temp=studentview.showRegisterCourse();
        for(int i=0;i<StudentList.get(index).getRegisterCourse().size();i++)
        { if (temp.equals(StudentList.get(index).getRegisterCourse().get(i).getCode()))
            {repeat = true;
            studentview.displayRepeatTrue();
            }
        }
        if(repeat == false){
            for (int i =0;i<CourseList.size();i++){
                if(temp.equals(CourseList.get(i).getCode())){
                    StudentList.get(index).getRegisterCourse().add(CourseList.get(i));
                    CourseList.get(i).getStuList().add(StudentList.get(index));
                    studentview.registersuccess();
                    CourseList.get(i).setSpace((CourseList.get(i).getSpace()-1));
                }
                else{
                    studentview.registerfail(temp);
                }
            }
        }
    }
   

    public void removeCourse(){
        String temp=studentview.showDeleteCourse();
        for (int i =0;i<CourseList.size();i++){ 
            if(temp.equals(CourseList.get(i).getCode())){
                StudentList.get(index).getRegisterCourse().remove(i);
                CourseList.get(i).setSpace((CourseList.get(i).getSpace()+1));
                studentview.removesuccess();
            }
            else{
                studentview.removefail(temp);
            }
        }   
    }

    public void viewStuCourse(){
        studentview.displayStuCourse(StudentList.get(index).getRegisterCourse());
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
