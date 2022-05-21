public class Ticket {

    String name;
    Integer price;
    Integer quantity;


    public Ticket(String name, Integer price, Integer quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
        public String getItemName() {
            return this.name;
        }

        public Integer getItemPrice() {
            return price;
        }

        public Integer getItemQuantity() {
            return quantity;
        }

    public void setItemName(String itemName) {
        this.name = itemName;
    }

    public void setItemPrice(Integer itemPrice) {
        this.price = itemPrice;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.quantity = itemQuantity;
    }

    public Integer getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " " + quantity + " @ $" + price + " = $" + getTotalPrice();
    }



}
