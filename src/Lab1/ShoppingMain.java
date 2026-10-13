
import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter product name: ");
    String productName = input.nextLine();

    System.out.print("Enter unit price: R");
    double price = input.nextDouble();

    System.out.print("Enter quantity: ");
    int quantity = input.nextInt();

    ShoppingTotal shop = new ShoppingTotal();

    double totalCost = shop.calculateTotal(price, quantity);
    double discount = shop.calculateDiscount(totalCost);
    double finalAmount = shop.calculateFinalAmount(totalCost, discount);

    System.out.println("Product Name: " + productName);
    System.out.println("Unit Price: R" + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Cost: R" + totalCost);
    System.out.println("Discount: R" + discount);
    System.out.println("Final Amount: R" + finalAmount);


}