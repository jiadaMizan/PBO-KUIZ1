package id.ac.polinema.oop;

public class Cashier {

    public double calculateChange(Order order, double cash) {
        if (order == null) {
            return 0.0;
        }
        double finalTotal = order.getFinalTotal();
        if (cash < finalTotal) {
            return -1.0; 
        }
        return cash - finalTotal;
    }

}
