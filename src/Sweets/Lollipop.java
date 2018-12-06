package Sweets;

import AbstractClasses.Sweet;

public class Lollipop extends Sweet {
    public Lollipop(String name, String vendorCode, double price, double weight){
        setName(name);
        setVendorCode(vendorCode);
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public String getName() {
        return "Леденец '" + super.getName() + "'";
    }
}
