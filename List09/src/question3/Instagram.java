package question3;

public class Instagram {
    public static void main(String[] args) {
        Post post1 = new Post("Me and the gang!", "url");
        Post post2 = new Post("Last night", "url");

        User usr1 = new User("Steve Harris", "url", post1);
        User usr2 = new User("Eric Singer", "url", post2);

        usr2.setName("Paul Stanley");
        usr1.getPost().setImage("mirtilos.png");

        usr2.getPost().setDescription("#BegoMirtilo");

        System.out.println(usr2.getPost().getDescription());
    }
}
