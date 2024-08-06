package question2;

public class Mario {
    public static void main(String[] args) {
        Player player1 = new Player("Yumi Cho", 5);
        Player player2 = new Player("Laurita Lane", 2);

        PlayerController playerController = new PlayerController();
        playerController.givePoints(player1);
        playerController.givePoints(player2, 10);

        System.out.println(player1.getPoints());
        System.out.println(player2.getPoints());
    }
}
