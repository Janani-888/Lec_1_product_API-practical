package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has
// the shared properties of a product and can be sold.
//
// A ShoppingCart is NOT a Product because it
// contains products rather than being a product.

public class PhysicalProduct extends Product
            implements Discountable {

    // Fields specific to physical products
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    // No-argument constructor for Jackson
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {

        // Initialize the shared Product fields
        super(id, name, price);

        // Initialize PhysicalProduct-specific fields
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    // Getter for weight
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
    // Override the parent summary for physical products
    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

    @Override
    public void applyDiscount(double rate) {
        // Physical product discounts cannot exceed 20%
        double capped = Math.min(rate, 0.20);

        // Calculate price using the capped discount
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
