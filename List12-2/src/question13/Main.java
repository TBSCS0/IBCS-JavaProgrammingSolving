package question13;

public class Main {
    public static void main(String[] args) {
        Player[] playersFoot = new Player[5];
        Player[] playersVol = new Player[5];

        playersFoot[0] = new Player("Miguel Brasil", 18);
        playersFoot[1] = new Player("Alexandre Marques", 17);

        playersVol[0] = new Player("Charlotte Sandoli", 16);
        playersVol[1] = new Player("Rafa Dias", 17);
        playersVol[2] = new Player("Bruno Rego", 15);

        Category[] categories = new Category[2];
        categories[0] = new Category("Football", playersFoot);
        categories[1] = new Category("Volley", playersVol);

        Competition competition = new Competition("ISSL", categories);

        for (int i = 0; i < competition.searchByCategory("Football").length; i++) {
            if (competition.searchByCategory("Football")[i] != null) {
                System.out.println(competition.searchByCategory("Football")[i].getName());
            }
        }

        competition.calculateAgeAverage();
    }
}
