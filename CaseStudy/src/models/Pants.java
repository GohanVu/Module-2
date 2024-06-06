package models;

import java.math.BigDecimal;

public class Pants extends Product{
    public Pants() {
    }

    public Pants(String code, String name, BigDecimal price, int quantity) {
        super(code, name, price, quantity);
    }
}
