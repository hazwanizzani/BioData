import Management.*;

public class Main {
    public static void main(String[] args) {


        ContactManager.initialize();
        ContactManager.addContact("Hazwan","0123456798","hazwanizzani@gmail.com");
        ContactManager.addContact("Izzani","0198765432","hazwanizzani@hotmail.com");
        ContactManager.addContact("Rashidi","0124681012","hazwanizzani@yahoo.com");

        Contact contact = ContactManager.searchContact("Hazwan");

        if (contact!=null){
            System.out.println("Contact Found: ");
            System.out.println(contact.toString());
        }
        else{
            System.out.println("Contact not found.");
        }
        System.out.println("\nContact List: ");
        ContactManager.displayContacts();

    }
}
