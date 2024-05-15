package Management;
import java.util.Arrays;

public class ContactManager {

    //set max number of contacts
    private static int MAX_CONTACTS = 100;
    //contact array
    private static Contact[] contacts = new Contact[MAX_CONTACTS];
    //count contacts list length
    private static int numOfContacts = 0;

    //initialize the contacts list array
    public static void initialize(){
        Arrays.fill(contacts,null);
    }

    public static void addContact(String contactName, String phoneNumber, String emailAddress){
        if (numOfContacts<MAX_CONTACTS){
            contacts[numOfContacts++] = new Contact(contactName,phoneNumber,emailAddress);
        }
        else{
            System.out.println("Contacts list is full. Cannot add more.");
        }
    }

    public static Contact searchContact(String contactName) {
        for (int i = 0; i < numOfContacts; i++) {
            if (contacts[i].getContactName().equalsIgnoreCase(contactName)) {
                return contacts[i];
            }
        }
        return null;
    }


    public static void displayContacts() {
        Arrays.sort(contacts, 0, numOfContacts);
        for (int i = 0; i < numOfContacts; i++) {
            System.out.println(contacts[i].toString());
        }
    }



}
