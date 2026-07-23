package OOP;

import java.util.*;

public class Library {
    private Map<String, LibraryItem> catalog = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();
    private Set<String> borrowedIds = new HashSet<>();

    public void addItem(LibraryItem item) {
        catalog.put(item.getId(), item);
    }

    public void addMember(Member m) {
        members.put(m.getMemberId(), m);
    }

    public void borrowItem(String memberId, String itemId) throws LibraryException {
        Member member = members.get(memberId);
        LibraryItem item = catalog.get(itemId);

        if (member == null) throw new LibraryException("Member not found: " + memberId);
        if (item == null) throw new LibraryException("Item not found: " + itemId);
        if (item.isBorrowed()) throw new LibraryException("Item " + itemId + " is already out.");
        if (!member.canBorrowMore()) throw new LibraryException("Member " + memberId + " has reached borrowing limit.");

        item.markBorrowed();
        member.addBorrowedItem(item);
        borrowedIds.add(itemId);
    }

    public void returnItem(String memberId, String itemId) throws LibraryException {
        Member member = members.get(memberId);
        LibraryItem item = catalog.get(itemId);

        if (member == null) throw new LibraryException("Member not found: " + memberId);
        if (item == null) throw new LibraryException("Item not found: " + itemId);
        if (!member.hasBorrowedItem(item)) throw new LibraryException("Member " + memberId + " did not borrow item " + itemId);

        item.markReturned();
        member.removeBorrowedItem(item);
        borrowedIds.remove(itemId);
    }

    public void listCatalog() {
        for (LibraryItem item : catalog.values()) {
            item.displayInfo();
        }
    }

    public void printReport() {
        System.out.println("---------- REPORT ----------");
        System.out.println("Total items    : " + catalog.size());
        System.out.println("Currently out  : " + borrowedIds.size());
        System.out.println("Borrowed ids   : " + borrowedIds);

        Map<String, Integer> typeCount = new HashMap<>();
        for (LibraryItem item : catalog.values()) {
            typeCount.put(item.getType(), typeCount.getOrDefault(item.getType(), 0) + 1);
        }
        System.out.println("Items by type  : " + typeCount);
        System.out.println("Total created  : " + LibraryItem.getTotalItemsCreated());
    }
}