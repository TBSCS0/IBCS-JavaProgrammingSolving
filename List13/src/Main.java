public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        userController.create("Oscar", 30);
        userController.update("dudu", 40);

        System.out.println( userController.getUsers() );
    }
}