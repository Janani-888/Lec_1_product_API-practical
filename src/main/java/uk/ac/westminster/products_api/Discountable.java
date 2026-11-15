package uk.ac.westminster.products_api;

public interface Discountable {

    // Apply a discount to the product
    void applyDiscount(double rate);

    // Return the discounted price
    double getDiscountedPrice();
}
