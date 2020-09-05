package com.dodhall.quicky.db.models;

public class Contact {
    private int contactId;
    private String phone;
    private String name;
    private String url;

    public Contact(int contactId, String phone, String name, String url) {
        this.contactId = contactId;
        this.phone = phone;
        this.name = name;
        this.url = url;
    }

    public int getContactID() {
        return contactId;
    }

    public void setContactID(int contactId) {
        this.contactId = contactId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
