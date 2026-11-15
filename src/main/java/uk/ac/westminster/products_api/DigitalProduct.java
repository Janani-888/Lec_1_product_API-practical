package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    // Fields specific to digital products
    private String downloadUrl;
    private double fileSizeMB;

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
}
