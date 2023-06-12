public class Staff {
    protected String name;
    protected String staffId;
    
    public Staff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }
    @Override
    public String toString() {
        return "Staff name: " + name + "\nStaff Id: " + staffId;
    }
    public String getName() {
        return name;
    }
    public Staff() {
        name = "Null";
        staffId = "";
    }
}
