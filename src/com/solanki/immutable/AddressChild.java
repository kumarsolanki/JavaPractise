package com.solanki.immutable;

public class AddressChild extends Address {
    public AddressChild(int addressId, String streetName) {
        super(addressId, streetName);
    }

    public void setStreetName(String streetName) {
        throw new UnsupportedOperationException();
    }

    public void setAddressId(int addressId) {
        throw new UnsupportedOperationException();
    }
}
