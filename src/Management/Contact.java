package Management;

public class Contact implements Comparable<Contact>{

    private String contactName;
    private String phoneNumber;
    private String emailAddress;

    //Constructor for Contact class

    public Contact(String contactName, String phoneNumber, String emailAddress) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //Setters and Getters

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "Name: " + contactName + ", Phone Number: " + phoneNumber + ", Email Address: " + emailAddress;
    }

    public int compareTo(Contact other) {
        return this.contactName.compareToIgnoreCase(other.getContactName());
    }
}
