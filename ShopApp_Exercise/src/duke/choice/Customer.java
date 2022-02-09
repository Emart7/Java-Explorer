package duke.choice;

public class Customer {

    private String name;
    private String size;
    
    //Exercise 5-3 Associate Customer with Clothing
    private Clothing[] items;

    //Exercise 6-1 Add Customer Constructor
    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }
    
    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalClothingCost() {
        double total = 0.0;
        
        for (Clothing item : items) {
//            if (c1.getSize().equals(item.getSize())) {
                total += item.getPrice();
//                System.out.println("The item product is: " + item.getDescription() + " , " + item.getSize() + " , " + item.getPrice());
//                total = total + total * tax;
//                if (total > 15) {
//                    break;
//                }
//            }
        
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

}
