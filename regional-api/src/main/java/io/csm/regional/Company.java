package io.csm.regional;

import java.util.List;

public class Company {
    private String name;
    private String chiefExcecutiveOfficer;
    private List<String> contacts;
    private Address address;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", chiefExcecutiveOfficer='" + chiefExcecutiveOfficer + '\'' +
                ", contacts=" + contacts +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChiefExcecutiveOfficer() {
        return chiefExcecutiveOfficer;
    }

    public void setChiefExcecutiveOfficer(String chiefExcecutiveOfficer) {
        this.chiefExcecutiveOfficer = chiefExcecutiveOfficer;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
