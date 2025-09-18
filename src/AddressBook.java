import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> BuddyList;
    public void addBuddy(BuddyInfo buddy){}
    public void removeBuddy(BuddyInfo buddy){}
    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Katie",657,"carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
