package lookup.model;

import lookup.annotation.MyAnnotation;

@MyAnnotation
public class SuperUser extends User {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "SuperUser:{" + super.toString() + "address=" + address + "}";
    }
}
