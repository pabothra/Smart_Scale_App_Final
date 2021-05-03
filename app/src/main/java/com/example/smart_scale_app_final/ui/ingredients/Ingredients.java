package com.example.smart_scale_app_final.ui.ingredients;

public class Ingredients {

    public String name;
    public String qty;
    public String units;

    public Ingredients(String name, String qty, String units) {
        this.name = name;
        this.qty = qty;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return qty;
    }

    public void setCount(String qty) {
        this.qty = qty;
    }

    public String getMeasurement() {
        return units;
    }

    public void setMeasurement(String units) {
        this.units = units;
    }
}
