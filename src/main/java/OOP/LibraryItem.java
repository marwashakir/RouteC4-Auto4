package OOP;

public abstract class LibraryItem {
    private String id;
    private String title;
    private boolean borrowed;
    private static int totalItemsCreated = 0;
    private static int nextNumber = 1;

    public LibraryItem(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("title can not be empty");
        }
        this.title = title;
        this.id = "ITEM-" + nextNumber++;
        totalItemsCreated++;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("title can not be empty");
        }
        this.title = title;
    }

    public boolean isBorrowed() { return borrowed; }
    public void markBorrowed() { this.borrowed = true; }
    public void markReturned() { this.borrowed = false; }

    public void displayInfo() {
        System.out.println(getId() + " | " + getTitle() + " | " + getType() +
                " | loan: " + getLoanPeriodDays() + " days | " +
                (isBorrowed() ? "OUT" : "available"));
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public abstract int getLoanPeriodDays();
    public abstract String getType();
}