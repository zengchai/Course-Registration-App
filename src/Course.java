import java.util.ArrayList;

public class Course {

    protected String name;
    protected String code;
    protected int credit;
    protected int space;
    protected Lecturer lec;
    protected ArrayList<Student> stuList;

    public Course(){
    }

    public Course(String n,String code,int c,int s){
        this.name = n;
        this.code = code;
        this.credit = c;
        this.space = s;
        this.lec = new Lecturer();
        this.stuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public int getSpace() {
        return space;
    }

    public String getCode() {
        return code;
    }
    
    public Lecturer getLec() {
        return lec;
    }

    public ArrayList<Student> getStuList(){
        return stuList;
    }

    public void setSpace(int space) {
        this.space = space;
    }


}
