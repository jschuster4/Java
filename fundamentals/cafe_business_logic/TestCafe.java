import java.util.ArrayList;

public class TestCafe {
    
    public static void main(String[] args){
        // make an instance of CafeUtil to access its methods
        CafeUtil cafe = new CafeUtil();

        int TestGetStreak = cafe.getStreakGoal();
        // System.out.println(TestGetStreak);

        double[] TestArray = {2,3,4,7,9,10,34,57,94};
        double TestTotal = cafe.getOrderTotal(TestArray);
        // System.out.println(TestTotal);

        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        // cafe.displayMenu(menuItems);

        ArrayList<String> customers = new ArrayList<>();
        for (int i=0; i<4; i++){
            cafe.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
