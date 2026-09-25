package id.ac.polinema.oop;

/**
 * A single item on the cafe menu.
 *
 * Complete every method body below (replace the
 * {@code throw new UnsupportedOperationException(...)} lines).
 * Do not change the class name, field names, method names, or signatures —
 * the autograder calls them exactly as defined here.
 *
 * Declare the fields yourself: see the class diagram in the README
 * (all fields must be private).
 */
public class MenuItem {

    /**
     * Creates a menu item and stores both parameters into the fields.
     *
     * @param name  item name
     * @param price price in Rupiah
     */

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
}
//sudah