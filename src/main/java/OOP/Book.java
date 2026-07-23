package OOP;

public class Book extends LibraryItem {
    private String authorrr;
    private int pages;

    public Book(String title, String author, int pages) {
        super(title);
        this.authorrr = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return authorrr;
    }
    public int getPages() {
        return pages;
    }

    @Override
    public int getLoanPeriodDays() {
        return 21;
    }

    @Override
    public String getType() { return "Book"; }
}