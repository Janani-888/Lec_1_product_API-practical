package uk.ac.westminster.products_api;

public class DigitalProduct extends Product
    implements Discountable {

    // Fields specific to digital products
    private String downloadUrl;
    private double fileSizeMB;

    //Tutorial 5 activity 4
    private double discountedPrice;

    // No-argument constructor
    public DigitalProduct() {
    }

    // Full constructor
    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {

        // Initialize inherited fields
        super(id, name, price);

        // Initialize child-specific fields
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price;
    }

    // Getter for download URL
    public String getDownloadUrl() {
        return downloadUrl;
    }

    // Getter for file size
    public double getFileSizeMB() {
        return fileSizeMB;
    }
    // Setter for download URL
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    // Setter for file size
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | Download: " + downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
