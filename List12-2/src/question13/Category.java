package question13;

public class Category {
    private String name;
    private Player[] players;

    public Category(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
