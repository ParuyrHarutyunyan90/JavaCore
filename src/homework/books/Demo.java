package homework.books;

import java.util.Scanner;

public class Demo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {

        bookStorage.add(new Book("Moon", "Ruso", 126.3, 2, "drama"));
        bookStorage.add(new Book("Sun", "Alik", 214.4, 4, "comedy"));
        bookStorage.add(new Book("Smile", "Poxos", 101.6, 5, "abstract"));
        bookStorage.add(new Book("Mars", "Petros", 107.9, 3, "all"));
        bookStorage.add(new Book("Earth", "Martiros", 158.0, 1, "none"));

        boolean run = true;
        while (run) {

            commandline();

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOKS:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printByPriceRange();
                    break;
                default:
                    System.out.println("invalid command, Please try again");


            }
        }
    }

    private static void printByPriceRange() {
        System.out.println("Please input book min price ");
        double min_price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book max price ");
        double max_price = Double.parseDouble(scanner.nextLine());
        bookStorage.printBookByPriceRange(min_price, max_price);
    }

    private static void printByGenre() {
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBookByAuthorName(authorName);
    }

    private static void addBooks() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book author name");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("Thank you book is added");


    }

    private static void commandline() {

        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOKS + " for add books");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");

    }


}
