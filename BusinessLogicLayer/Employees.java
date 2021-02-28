package BusinessLogicLayer;

public class Employees {
    int employeeID;
    String empfirstname;
    String emplastname;
    String emppassword;

    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public String getFirstname(){
        return empfirstname;
    }
    public void setFirstname(String empfirstname){
        this.empfirstname = empfirstname;
    }
    public String getLastname(){
        return emplastname;
    }
    public void setLastname(String emplastname){
        this.emplastname = emplastname;
    }
    public String getPassword(){
        return emppassword;
    }
    public void setPassword(String emppassword){
        this.emppassword = emppassword;
    }
    
    public Employees(){}

    public Employees(int employeeID, String empfirstname, String emplastname, String emppassword){
        this.employeeID = employeeID;
        this.empfirstname = empfirstname;
        this.emplastname = emplastname;
        this.emppassword = emppassword;
    }
    public String toStrong(){
        return employeeID + "," + empfirstname + "," + emplastname + "," + emppassword;
    }
}
