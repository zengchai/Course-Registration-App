public class Course {

    protected String name;
    protected String code;
    protected int credit;
    protected int space;
    protected Lecturer lec;

    public Course(){
    }

    public Course(String n,String code,int c,int s){
        this.name = n;
        this.code = code;
        this.credit = c;
        this.space = s;
        this.lec = new Lecturer();
    }

    public void setLec(Lecturer lec) {
        this.lec = lec;
    }

    @Override
    public String toString(){
        return "Course Name: " + name + "\nCourse code: " + code + "\nCourse credit: " + credit + "\nCourse Capacity: " + space + "\nCourse Lecturer: " + lec.getName();
    }

    public String getCode() {
        return code;
    }
    
    public String getLec() {
        return lec.getName();
    }
}
