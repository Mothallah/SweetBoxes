package Sweets;

import AbstractClasses.Sweet;

public class Сrustula extends Sweet {
    public Сrustula(String name, String vendorCode, double price, double weight) {
        setName(name);
        setVendorCode(vendorCode);
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public String getName() {
        return "Печенье '" + super.getName() + "'";
    }
}
