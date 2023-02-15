package model;

import java.util.Objects;

public class Contact {
    private String name;
    private String personalId;

    public Contact(String name, String personalId) {
        this.name = name;
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return personalId.equals(contact.personalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalId);
    }
}