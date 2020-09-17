package com.bcaf.ivan.listviewexercise.Entity;

import java.util.List;

public class Response {
    List<Contacts> contacts;

    public Response(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }
}
