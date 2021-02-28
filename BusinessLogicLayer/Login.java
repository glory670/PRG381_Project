package BusinessLogicLayer;
import java.util.*;
public class Login {
    static Registration reg = new Registration();

    public static void main(String[] args) throws NoSuchFieldException{
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print(" Enter firstName => ");
            String firstName = scan.nextLine();
            reg.setFirstName(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scan.nextLine();
            reg.setLastName(lastName);

            System.out.print(" Enter DateOfBirth => ");
            int age = scan.nextInt();
            reg.setDate(age);

           System.out.print(" Enter emailId => ");
           String emailId = scan.nextLine();
           reg.setEmailId(emailId);

           System.out.print(" Enter password => ");
           String password = scan.nextLine();
           reg.setPassword(password);

           System.out.print(" Enter phoneNo => ");
           long phoneNo = scan.nextLong();
           reg.setPhoneNo(phoneNo);

           System.out.print(" Enter Gender => ");
           String gender = scan.nextLine();
           reg.setGender(gender);

           System.out.print(" Enter Address => ");
           String address = scan.nextLine();
           reg.setAddress(address);

           System.out.println(reg.toString());
        }

        Scanner scanner = new Scanner(System.in); 
        System.out.print(" Enter Email Address => ");
        String emailId = scanner.nextLine();

        System.out.print(" Enter password => ");
        String password = scanner.nextLine();

        if ("glory".equals(emailId) && "password".equals(password)) {
            System.out.println(" User successfully logged-in.. ");
        } else {
            System.out.println(" In valid userName of password ");
        }
        scanner.close();
    }
}
