public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private Ticket[] cartItems;
    private static final int capacity = 100;
    private Integer itemCount;

    public ShoppingCart() {
//        super();
        this.customerName = "UNKNOWN";
        this.currentDate = "1 May 2022";
        cartItems = new Ticket[capacity];
        itemCount = 0;
    }

    public ShoppingCart(String customerName, String currentDate) {
//        super();
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new Ticket[capacity];
        itemCount = 0;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCurrentDate() {
        return this.currentDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public boolean addItem(Ticket item) {
        if (itemCount == 100) {
            System.out.println("SHOPPING CART IS FULL");
            return false;
        }
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equals(item.getItemName())) {
                System.out.println("ITEM ALREADY EXISTS");
                return false;
            }
        }
        cartItems[itemCount++] = item;
        return true;
    }

    public boolean removeItem(String item) {
        for (Ticket ticket: cartItems){
            if (ticket.getItemName()==item){
                System.out.println("DELETED");
                itemCount--;
                return true;
            }
        }
        return false;
    }

    public int getNumItemsInCart() {
//        int count = 0;
//            for (int i = 0; i < itemCount; i++) {
//                count = count + cartItems[i].getItemQuantity();
//        }
        return itemCount;
    }

    public int getCostOfCart(){
        int cost = 0;
            for (int i = 0; i < itemCount; i++)
                cost = cost + cartItems[i].getTotalPrice();
        return cost;
    }

    public void printTotal(){
        System.out.println(customerName+" - "+currentDate);
        if(itemCount==0){
            System.out.println("SHOPPING CART IS EMPTY.");
        }else{
            System.out.println("Number of Items: "+getNumItemsInCart());
            for(int i =0; i<itemCount;i++)
                System.out.println(cartItems[i]);
            System.out.println("Total: $"+getCostOfCart());
        }
    }


}
