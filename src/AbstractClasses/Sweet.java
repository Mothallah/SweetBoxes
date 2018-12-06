package AbstractClasses;

abstract public class Sweet {
    private String name, vendorCode;
    private double price, weight;

    public String getName() {
        return name;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setVendorCode(String newVendorCode) {
        vendorCode = newVendorCode;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

}
