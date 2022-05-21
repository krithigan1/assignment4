import java.util.Scanner;

public class CartManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name:");
        String cuName = sc.nextLine();
        System.out.println("Enter the current date:");
        String date = sc.nextLine();
        ShoppingCart cart = new ShoppingCart(cuName,date);

        System.out.println("Enter the item name:");
        String name = sc.nextLine();
        System.out.println("Enter the item price:");
        int price = sc.nextInt();
        System.out.println("Enter the item quantity:");
        int quantity = sc.nextInt();
        Ticket item1 = new Ticket(name, price, quantity);
        System.out.println(item1);

        cart.addItem(item1);


        System.out.println("Enter yes or no: " );
        String choice = sc.nextLine();
        System.out.println("Entered choice is: " + choice);

//
//        cart.addItem(item2);

//        cart.printTotal();





    }

}
