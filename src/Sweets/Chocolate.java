package Sweets;

import AbstractClasses.Sweet;

public class Chocolate extends Sweet {
    public Chocolate(String name, String vendorCode, double price, double weight) {
        setName(name);
        setVendorCode(vendorCode);
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public String getName() {
        return "Шоколадка '" + super.getName() + "'";
    }
}
