public class Lecturer {
    private Staff lec;
    private Course cours;
    
    public Lecturer(String n,String i) {
        this.lec = new Staff(n, i);
        this.cours = null;
    }
    public void setCours(Course cours) {
        this.cours = cours;
    }
    public String getName() {
        return lec.getName();
    }
    public Lecturer() {
        this.lec = new Staff();
    }

}
