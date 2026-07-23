package OOP;

public class DVD extends LibraryItem {
    private int runtimeMinutesss;

    public DVD(String tittle, int runtimeMinutes) {
        super(tittle);
        if (runtimeMinutes <= 0) {
            throw new IllegalArgumentException("runtime must be greater 0");
        }
        this.runtimeMinutesss = runtimeMinutes;
    }

    public int getRuntimeMinutes() {

        return runtimeMinutesss;
    }

    @Override
    public int getLoanPeriodDays() {
        return 3;

    }

    @Override
    public String getType() {
        return "DVD";
    }
}