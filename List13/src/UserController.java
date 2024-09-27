import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserController {
    private LinkedList<User> users;

    public UserController(){

    }

    public void read(){
        try {
            FileReader fileReader = new FileReader("users.csv");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                User user = new User(data[0], Integer.parseInt(data[1]));
                users.add(user);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading users.csv");
        }

    }

    public void create(){}

    public void update(){}

    public void delete(){}
}
