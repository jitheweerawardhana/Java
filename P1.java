public class P1 {
    private String title;
    private String author;
    private int yearOfPublication;

    public P1(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
    }

    public String getTitle() {
        return title;
    }
}
