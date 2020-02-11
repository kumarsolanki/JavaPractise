package com.solanki.immutable;

public class Address implements  Cloneable{

    int addressId;
    String streetName;

    public Address(int addressId, String streetName) {
        this.addressId = addressId;
        this.streetName = streetName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
