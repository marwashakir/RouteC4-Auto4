package OOP;


public class Magazine extends LibraryItem {
    private int issueNumberrr;

    public Magazine(String title, int issueNumber) {

        super(title);

        this.issueNumberrr = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumberrr;
    }

    @Override
    public int getLoanPeriodDays() {

        return 7;
    }

    @Override
    public String getType() {
        return "Magazine";

    }
}