package question2;

public class PlayerController {
    PlayerController(){

    }

    public void givePoints(Player player){
        int points = player.getPoints() + 1;
        player.setPoints(points);
    }

    public void givePoints(Player player, int x){
        int points = player.getPoints() + x;
        player.setPoints(points);
    }
}
