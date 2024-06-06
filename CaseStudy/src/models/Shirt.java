package models;

import java.math.BigDecimal;

public class Shirt extends Product{
    public Shirt() {
    }

    public Shirt(String code, String name, BigDecimal price, int quantity) {
        super(code, name, price, quantity);
    }
}
