import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserController {
    private LinkedList<User> users;

    public UserController(){
        users = new LinkedList<>();
        read();
    }

    public LinkedList<User> getUsers() {
        return users;
    }

    public void read(){
        try {
            FileReader fileReader = new FileReader("./data/users.csv");
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

    public void create(String name, int age){
        try {
            FileWriter fileWriter = new FileWriter("./data/users.csv", true);
            fileWriter.write(name+","+age+"\n");
            fileWriter.close();

            User user = new User(name, age);
            users.add(user);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(){

    }

    public void delete(){

    }
}
