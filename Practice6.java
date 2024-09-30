class Practice6 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.borrowBook("1984");

        library.displayBooks();
    }
}

class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
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


class Library {
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


