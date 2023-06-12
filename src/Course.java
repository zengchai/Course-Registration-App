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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public Lecturer getLec() {
        return lec;
    }

    public void setLec(Lecturer lec) {
        this.lec = lec;
    }


}
