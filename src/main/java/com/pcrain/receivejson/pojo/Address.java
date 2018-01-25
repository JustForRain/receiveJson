package com.pcrain.receivejson.pojo;

public class Address {
    private String street;//某条路
    private String unit;//几单元
    private int floor;//几层

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", unit='" + unit + '\'' +
                ", floor=" + floor +
                '}';
    }
}
