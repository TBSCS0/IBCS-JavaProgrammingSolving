package question3;

public class Amazon {
    public static void main(String[] args) {
        Task tsk1 = new Task("Sector A", "Fix robot kiva");
        Task tsk2 = new Task("Sector B", "Lift light boxes");
        Staff stf1 =  new Staff("Alexandre", "ale2021", "123", "ale@email.com", "stock robots",tsk1);
        Staff stf2 =  new Staff("Luiz", "luiz2021", "123", "luiz@email.com", "forklift driver", tsk2);
        Manager man1 = new Manager("Jeffrey Bezos", "bezos1986", "123", "jeff@email.com", "Sector B");

        System.out.println( stf1.getTask().getLocal() );
        System.out.println( stf2.getTask().getLocal() );
        stf1.getTask().setDescription("Fix robot pegasus");
        stf2.getTask().setDescription("Lift heavy boxes");


    }
}
