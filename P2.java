
public class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            books[i].displayDetails();
            System.out.println();
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book borrowed: " + books[i].getTitle());
                books[i] = null; 
                return;
            }
        }
        System.out.println("Book not available.");
    }
}
