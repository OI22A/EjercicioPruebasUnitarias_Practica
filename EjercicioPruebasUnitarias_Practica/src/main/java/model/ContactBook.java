package model;
import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private List<Contact> contactList;

    public ContactBook() {
        this.contactList = new ArrayList<Contact>();


    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public boolean add(String name, String email, String phone) {
        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                return false;
            }
        }
        contactList.add(new Contact(name, email, phone));
        return true;
    }

    public Contact search(String email) {
        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                return contact;
            }
        }
        return null;
    }

    public Contact remove(String name, String email, String phone) {
        Contact toRemove = null;
        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                toRemove = contact;
                break;
            }
            if (toRemove != null) {
                contactList.remove(toRemove);
                return toRemove;
            }

        }
        return null;

    }
}

