package Lab5;

public class ProductMain {
    void main () {
        Product[] products = {
            new Product ("Drink", 19.99,5),
            new Product ("Apple",5,7),
            new Product ("Cornflakes", 59.99,20),
            new Product ("Carrots", 6.99,13),
        };

double subtotal = 0;

        for(int i = 0; i < products.length; i++) {

            double lineTotal = products[i].price * products[i].quantity;

            System.out.println(" Quantity: " + products[i].quantity);

            System.out.println(products[i].name + " = " +lineTotal);

            subtotal = subtotal + lineTotal;

        }

        double discount = 0;

        if(subtotal > 1000) {

            discount = subtotal * 0.10;

        }

   double finalTotal = subtotal - discount;

        System.out.println("Subtotal is: " + subtotal);
        System.out.println("Discount is: " + discount);
        System.out.println("Final total is: " + finalTotal);
    }
}
