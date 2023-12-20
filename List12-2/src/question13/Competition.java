package question13;

public class Competition {
    private String name;
    private Category[] categories;

    private double ageAverage;

    public Competition(String name, Category[] categories) {
        this.name = name;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Player[] searchByAge(int age){
        Player[] foundPlayers = new Player[5];
        int k = 0;
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].getPlayers().length; j++) {
                if (categories[i].getPlayers()[j].getAge() == age){
                    foundPlayers[k] = categories[i].getPlayers()[j];
                    k++;
                }
            }
        }
        return foundPlayers;
    }

    public Player[] searchByCategory(String category){
         Player[] foundPlayers = new Player[5];
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].getName().equals(category)){
                foundPlayers = categories[i].getPlayers();
            }
        }
        return foundPlayers;
    }

    public void calculateAgeAverage(){
        int sumAge = 0;
        int count = 0;
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].getPlayers().length; j++) {
                sumAge = sumAge + categories[i].getPlayers()[j].getAge();
                count++;
            }
        }
        ageAverage = sumAge/count;
        System.out.println(ageAverage);
    }
}
