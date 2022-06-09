import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Order(){
        this.name = "Guest"; 
        this.items = new ArrayList<>();
        this.ready = false;
    }

    public Order(String name){
        this.name = name; 
        this.items = new ArrayList<>();
        this.ready = false;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        String orderReady = "Your order is ready";
        String notReady = "Thank you for waiting. Your order will be ready soon";
        if (this.ready == true){ 
            return orderReady;
        }
        else{
            return notReady;
        }
    }

    public double getOrderTotal(){ 
        double total = 0;
        for (int i=0; i<items.size(); i++){
            Item itemObject = this.items.get(i);
            total += itemObject.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name: " + this.name);
        for (int i=0; i<items.size(); i++){
            Item itemObject = this.items.get(i);
            System.out.println(itemObject.getName() + ": $" + itemObject.getPrice());
        }
        System.out.println("Total :  $" + getOrderTotal());
    }

}
