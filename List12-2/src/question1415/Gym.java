package question1415;

public class Gym {
    private String name;
    private Customer[] customers;
    private Staff[] staffs;

    public Gym() {
        customers = new Customer[5];
        staffs = new Staff[5];
    }

    public void addCustomer(Customer customer){
        for (int i = 0; i < customers.length; i++) {
            if(customers[i] == null){
                customers[i] = customer;
            }
        }
    }

    public void addStaff(Staff staff){
        for (int i = 0; i < staffs.length; i++) {
            if(staffs[i] == null){
                staffs[i] = staff;
            }
        }
    }

    public boolean hasStaff(){
        boolean flag = false;
        for (int i = 0; i < staffs.length; i++) {
            if(staffs[i] != null){
                flag = true;
            }
        }
        return flag;
    }

    public String[] searchByExerciseId(int id){
        int k = 0;
        String[] arr = new String[5];
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < customers[i].getExercises().length; j++) {
                if(customers[i].getExercises()[j].getId() == id){
                    arr[k] = customers[i].getExercises()[j].getName();
                    k++;
                }
            }
        }

        return arr;
    }
}
