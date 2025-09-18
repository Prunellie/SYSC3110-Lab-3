import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        this.buddyList = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){this.buddyList.add(buddy);}
    public void removeBuddy(BuddyInfo buddy){this.buddyList.remove(buddy);}

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Katie",657,"carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("hello");
    }
}
