
class ShoppingTotal {

    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    double calculateDiscount(double totalCost) {
        return totalCost * 0.10;
    }

    double calculateFinalAmount(double totalCost, double discount) {
        return totalCost - discount;
    }
}
