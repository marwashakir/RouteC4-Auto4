package OOP;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private int maxAllowed;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Member(String memberId, String name, int maxAllowed) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Member name cannot be empty");
        }
        if (maxAllowed <= 0) {
            throw new IllegalArgumentException("Max allowed must be positive");
        }
        this.memberId = memberId;
        this.name = name;
        this.maxAllowed = maxAllowed;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getMaxAllowed() { return maxAllowed; }

    public int getBorrowedCount() { return borrowedItems.size(); }
    public boolean canBorrowMore() { return borrowedItems.size() < maxAllowed; }

    public void addBorrowedItem(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    public boolean hasBorrowedItem(LibraryItem item) {
        return borrowedItems.contains(item);
    }
}