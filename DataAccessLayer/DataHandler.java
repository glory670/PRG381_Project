package DataAccessLayer;
import BusinessLogicLayer.*;
import java.io.*;
import java.util.*;
public class DataHandler {
    public List<Clients> GetClients() throws FileNotFoundException{
        List<Clients> clist = new ArrayList<Clients>();
        File file = new File("C:\\Users\\Aura\\Desktop\\PRG381 Project\\Clients.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            clist.add(new Clients(Integer.parseInt(line[0]),line[1],line[2],Integer.parseInt(line[3]),line[4],line[5],line[6]));

        }
        return clist;
    }

    Clients client = new Clients();
    
    public void AddClient() throws IOException {
        File file = new File("C:\\Users\\Aura\\Desktop\\PRG381 Project\\Clients.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        
        try (Scanner scan = new Scanner(System.in)) {
            if(file.exists()){
                FileReader fr = new FileReader(file);
                LineNumberReader lr = new LineNumberReader(fr);
                int linecount = 0;
                while(lr.readLine()!=null){
                    linecount++;
                }
                client.setClientID(linecount+1);
            }

            System.out.print(" Enter firstName => ");
            String firstName = scan.nextLine();
            client.setFirstname(firstName);

            System.out.print(" Enter lastName => ");
            String lastName = scan.nextLine();
            client.setLastname(lastName);

            System.out.print(" How old are you? => ");
            int age = scan.nextInt();
            client.setAge(age);

           System.out.print(" Enter email address => ");
           String email = scan.nextLine();
           client.setEmail(email);

           System.out.print(" Enter phone number => ");
           String phoneNo = scan.nextLine();
           client.setPhoneNo(phoneNo);

           System.out.print(" Enter a new password => ");
           String password = scan.nextLine();
           client.setPassword(password);

           pw.println(client.toString());

           //System.out.println(client.toString());
        }

        //Scanner scanner = new Scanner(System.in); 
        //System.out.print(" Enter Email Address => ");
        //String emailId = scanner.nextLine();

        //System.out.print(" Enter password => ");
        //String password = scanner.nextLine();

        //if ("glory".equals(emailId) && "password".equals(password)) {
            //System.out.println(" User successfully logged-in.. ");
        //} else {
            //System.out.println(" In valid userName of password ");
        //}
        //scanner.close();
    }
    public void verifyLogin(String email,String password){
        

    }

}
