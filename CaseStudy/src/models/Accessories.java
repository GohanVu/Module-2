package models;

import java.math.BigDecimal;

public class Accessories extends Product{
    public Accessories() {
    }

    public Accessories(String code, String name, BigDecimal price, int quantity) {
        super(code, name, price, quantity);
    }
}
