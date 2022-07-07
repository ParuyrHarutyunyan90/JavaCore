package homework.books;

import homework.books.commands.Commands;
import homework.books.enumes.Gender;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class Demo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {

        login();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;

                default:
                    System.out.println("invalid command, Please try again");


            }
        }
    }

    private static void login() {
        String login = "admin";
        String password = "123456";
        System.out.println("Please input login");
        if (!login.equals(scanner.nextLine())) {
            System.out.println("incorrect login ! ! !");
            login();
        }
        System.out.println("Please input password");
        if (!password.equals(scanner.nextLine())) {
            System.out.println("incorrect Password ! ! !");
            login();
        }
    }

    private static void addAuthor() {

        System.out.println("Pleae input author name");
        String name = scanner.nextLine();
        System.out.println("Pleae input author surName");
        String surName = scanner.nextLine();
        System.out.println("Pleae input author email");
        String email = scanner.nextLine();
        System.out.println("Please input author gender (MALE) (FEMALE)");
        try {
            Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
            Author author = new Author(name, surName, email, gender);
            authorStorage.add(author);
            System.out.println("Author added");
        } catch (IllegalArgumentException e) {
            System.out.println("incorrect gender: Please input MALE or FEMALE");
            addAuthor();
        }


    }

    private static void printByPriceRange() {
        System.out.println("Please input book min price ");
        try {
            double min = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book max price ");
            double max = Double.parseDouble(scanner.nextLine());
            bookStorage.printBookByPriceRange(min, max);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
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
        if (authorStorage.getSize() == 0) {
            System.out.println("no Author: please add Author");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("Please input book author name index");
            try {
                int index = Integer.parseInt(scanner.nextLine());

                try {
                    Author author = authorStorage.getByIndex(index);


                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input book price");
                    String priceStr = scanner.nextLine();
                    System.out.println("Please input book count");
                    String countStr = scanner.nextLine();
                    System.out.println("Please input book genre");
                    String genre = scanner.nextLine();

                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    Book book = new Book(title, author, price, count, genre);
                    bookStorage.add(book);
                    System.out.println("Thank you book is added");

                } catch (AuthorNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            } catch (NumberFormatException e) {
                e.getMessage();
            }
        }


    }

    private static void commandline() {

        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOKS + " for add books");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("Please input " + ADD_AUTHOR + " add author");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " for print all Authors");

    }

}
