public class Book {
    private String name;
    private int pages;
    private int year;

    public Book(String initialName, int initialPages, int initialYear) {
        this.name = initialName;
        this.pages = initialPages;
        this.year = initialYear;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
