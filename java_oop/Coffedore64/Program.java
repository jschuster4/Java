import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) {
    
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
    
        // Menu items
        coffeeKiosk.addMenuItem("cappucino", 5.5);
        coffeeKiosk.addMenuItem("Mocha", 6.5);
        coffeeKiosk.addMenuItem("Latte", 4.5);
        coffeeKiosk.addMenuItem("Drip Coffee", 5.0);
    
       // Order
    //    coffeeKiosk.addMenuItemByInput();
        coffeeKiosk.newOrder();
    }
}




        // // Menu items
        // Item item1 = new Item();
        // item1.setName("mocha");
        // item1.setPrice(4.85);

        // Item item2 = new Item();
        // item2.setName("latte");
        // item2.setPrice(7.05);

        // Item item3 = new Item();
        // item3.setName("drip coffee");
        // item3.setPrice(3.00);

        // Item item4 = new Item();
        // item4.setName("capuccino");
        // item4.setPrice(4.25);
    
        // // Order variables -- order1, order2 etc.
        // Order order1 = new Order();

        // Order order2 = new Order();

        // Order order3 = new Order();
        // order3.setName("Noah");

        // Order order4 = new Order();
        // order4.setName("Sam");
        
        // Order order5 = new Order();
        // order5.setName("Jake");

        // // Application Simulations
        // // Use this example code to test various orders' updates

        // //print out the object, but not the pertinent information
        // // System.out.print(order1);

        // // System.out.println(order1.total);

        // order1.addItem(item1);
        // order1.addItem(item2);

        // order2.addItem(item3);
        // order2.addItem(item3);

        // order3.addItem(item4);
        // order3.addItem(item4);

        // order4.addItem(item4);
        // order4.addItem(item1);

        // order5.addItem(item2);
        // order5.addItem(item3);

        // // order1.setReady(true); 
        // // System.out.println(order1.getStatusMessage());

        // // System.out.println(order1.getItems());

        // // System.out.println(order3.getOrderTotal());

        // order3.display();

