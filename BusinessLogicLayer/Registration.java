public class Registration{

    String firstName;
     String lastName;
     String DOB;
     String password;
     String emailId;
     Long phoneNo;
     String address;
     String gender;
     
     String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDate() {
        return DOB;
    }
    public void setDate(String DOB) {
        this.DOB = DOB;
    }
    
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Register [\n firstName=" + firstName + "\n lastName=" + lastName + "\n DateOfBirth=" + DOB + "\n password=" +
            password + "\n emailId=" + emailId + "\n phoneNo=" + phoneNo + "\n Gender=" +gender +"\n Address=" +address+"]";
    }
}