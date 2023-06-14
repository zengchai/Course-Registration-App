public class Lecturer {
    private Staff lec;
    
    public Lecturer(String name,String lecid) {
        this.lec = new Staff(name, lecid);
    }

    public String getName() {
        return lec.getName();
    }

    public String getLectID() {
        return lec.getName();
    }
    
}

