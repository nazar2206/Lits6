package com.lits1;

public enum productType {
    DRINK("CowProd"), ELECTRONICS("Telev"), FOOD("Bread");

    private String description;

    public String getDescription() {
        return description;
    }

    productType(String description) {
        this.description = description;
    }
}
