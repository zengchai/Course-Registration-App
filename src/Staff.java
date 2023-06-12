public class Staff {
    protected String name;
    protected String staffId;
    
    public Staff() {
        name = "Null";
        staffId = "";
    }
    public Staff(String name, String staffId) {
        this.name = name;
        this.staffId = staffId;
    }
    public String getstaffId(){
        return staffId;
    }
    @Override
    public String toString() {
        return "Staff name: " + name + "\nStaff Id: " + staffId;
    }
    public String getName() {
        return name;
    }
}