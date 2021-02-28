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
}
