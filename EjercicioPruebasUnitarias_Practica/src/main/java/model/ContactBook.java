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

    public String search(String email) {
        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                return contact.toString();
            }
        }
        return null;
    }

    public String remove(String email) {
        Contact toRemove = null;
        String msg= "";

        for (Contact contact : contactList) {
            if (contact.getEmail().equals(email)) {
                toRemove = contact;
            }

            if (toRemove != null) {
                contactList.remove(toRemove);
                msg += "El contacto ha sido eliminado\n"+toRemove;
                return msg;
            }

        }
        return null;

    }
}

