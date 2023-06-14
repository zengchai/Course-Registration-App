public class Acad {
    private Staff aca;
    private String password;
    

    public Acad(String name, String staffid, String password){
        this.aca = new Staff(name, staffid);
        this.password = password;
    }
    

    public Staff getAca() {
        return aca;
    }

    public String getPassword() {
        return password;
    }

}   
