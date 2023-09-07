import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void markAsBorrowed() {
        borrowed = true;
    }

    public void markAsReturned() {
        borrowed = false;
    }
}

class Library {
    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public ArrayList<Book> searchBooks(String query) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public void markBookStatus(String title, String action) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (action.equalsIgnoreCase("borrow")) {
                    book.markAsBorrowed();
                } else if (action.equalsIgnoreCase("return")) {
                    book.markAsReturned();
                }
            }
        }
    }

    public void displayCatalog() {
        System.out.println("Catalog:");
        for (int i = 0; i < catalog.size(); i++) {
            Book book = catalog.get(i);
            String status = book.isBorrowed() ? " (Borrowed)" : "";
            System.out.println((i + 1) + ". Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Year: " + book.getPublicationYear() +
                    ", ISBN: " + book.getISBN() + status);
        }
    }
}

public class LibraryCatalogSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Catalog System!");

        while (true) {
            System.out.println("\n1. Add Book\n2. Search Books\n3. Mark Borrowed/Returned\n4. Display Catalog\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the publication year: ");
                    int publicationYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the ISBN: ");
                    String ISBN = scanner.nextLine();
                    Book newBook = new Book(title, author, publicationYear, ISBN);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the title or author to search: ");
                    String query = scanner.nextLine();
                    ArrayList<Book> searchResults = library.searchBooks(query);
                    if (searchResults.isEmpty()) {
                        System.out.println("No matching books found.");
                    } else {
                        System.out.println("Matching books:");
                        for (int i = 0; i < searchResults.size(); i++) {
                            Book result = searchResults.get(i);
                            System.out.println((i + 1) + ". Title: " + result.getTitle() +
                                    ", Author: " + result.getAuthor() +
                                    ", Year: " + result.getPublicationYear() +
                                    ", ISBN: " + result.getISBN());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the title of the book to mark (borrow/return): ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter 'borrow' or 'return': ");
                    String action = scanner.nextLine();
                    library.markBookStatus(bookTitle, action);
                    if (action.equalsIgnoreCase("borrow")) {
                        System.out.println("Book marked as borrowed!");
                    } else if (action.equalsIgnoreCase("return")) {
                        System.out.println("Book marked as returned!");
                    } else {
                        System.out.println("Invalid action. Use 'borrow' or 'return'.");
                    }
                    break;

                case 4:
                    library.displayCatalog();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
