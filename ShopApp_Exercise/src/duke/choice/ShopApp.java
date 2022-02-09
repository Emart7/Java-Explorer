package duke.choice;

//import io.helidon.webserver.Routing;
//import io.helidon.webserver.ServerConfiguration;
//import io.helidon.webserver.WebServer;

import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {
        // TODO code application logic here

        //Exercise 6-1 Add Customer Constructor.
        Customer c1 = new Customer("Pinki", 3);
        //c1.setName("Pinki");
        //c1.setSize("S");

        //Excercise Clothing class
        double tax = 0.2;
        double total = 0.0;

        //Excercise Customer class
        System.out.println("Welcome to Duke Choice Shop!");

        //Exercise 6-3 Use static Constants
        System.out.println("Min price: " + Clothing.MIN_PRICE);

        //Exercise 6-2 Add Clothing Constructor
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5., "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        
        Clothing[] items = {item1, item2, item3, item4};//Exercise 4-4
        
//        try {
//            ItemList list = new ItemList(items);
//            Routhing routhing = Routing.builder().get("items", list).build();
//            
//            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
//            WebServer ws = WebServer.create(config, routhing);
//            ws.start();
//        } catch (UnknownHostException ex) {
//            ex.printStackTrace();
//        }

//      
//        System.out.println("The item1 product is: " + item1.description + " , " + item1.size + " , " + item1.price);
//
//        System.out.println("The item2 product is: " + item2.description + " , " + item2.size + " , " + item2.price);
        //total = (item1.price + item2.price * 2) * 1 + tax;
//        System.out.println("El valor neto a pagar es: " + (item1.getPrice() + item2.getPrice()));
//        System.out.println("El valor a pagar, incluido el iva, es: " + total);
        //Excercise 4-1 Using switch Statements
        int measurement = 8;

        c1.addItems(items);

        //Exercise 5-1 Apply Encapsulation;
//        c1.setSize(measurement);
        //Exercise 4-2 Using an Array. Clothing[] items = {item1, item2};       
        //Exercise 4-3 Using a Loop to Process an Array;
        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
//            System.out.println("The item product is: " + item.getDescription() + " , " + item.getSize() + " , " + item.getPrice());
            System.out.println("Item output " + item);
        }

        //Exercise 7-1        
        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {

                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count == 0) ? 0 : average / count;
            average = average / count;
            System.out.println("Average price " + average + ", count " + count);

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0.");
        }

        Arrays.sort(c1.getItems());     //Exercise 8-2 Sort Clothing Items
        for (Clothing item : c1.getItems()) {
//            System.out.println("The item product is: " + item.getDescription() + " , " + item.getSize() + " , " + item.getPrice());
            System.out.println("Item output " + item);
        }

    }
}
