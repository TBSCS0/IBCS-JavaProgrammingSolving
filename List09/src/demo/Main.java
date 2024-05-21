package demo;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie(
                "ataque dois mirtilo 2",
                "21/05/2024",
                "rogerinh, thiaguinh, tais carla",
                "azul goiaba",
                12.98,
                true,
                278
        );

        movie.setTitle("ataque dos mirtilos 3");
        System.out.println(movie.getTitle());

        movie.setReleaseDate("daqui a trinta minuto");
        System.out.println(movie.getReleaseDate());

        movie.setCast("Mr oscar");
        System.out.println(movie.getCast());

        movie.setPosterColor("pedro");
        System.out.println(movie.getPosterColor());

        movie.setTicketPrice(74568.34);
        System.out.println(movie.getTicketPrice());

        movie.setHasMirtilo(false);
        System.out.println(movie.getHasMirtilo());

        movie.setDuration(3178);
        System.out.println(movie.getDuration());
    }
}
