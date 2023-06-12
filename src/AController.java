import java.util.ArrayList;

public class AController {
    ArrayList<Acad> acadList;
    ArrayList<Course> courseList;
    AcadView acadView;

    public void creatCourse(){
        Course c = acadView.displaycreatCourse();
        courseList.add(c);
    }

}
