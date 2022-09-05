package old.lab_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_7_Object {
    public static void main(String[] args) {
        int option;
        boolean isContinuing = true;
        List<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while (isContinuing) {
            printMenu();
            System.out.print("Please, enter number: ");
            option = scan.nextInt();
            if (option == 1) {
                inputBook(bookList, scan);
            } else if (option == 2) {
                findBookByIsbn(scan, bookList);
            } else if (option == 3) {
                printAllBooks(bookList);
            } else if (option == 0) {
                isContinuing = false;
            } else {
                System.out.println("Please choose valid option!");
            }
        }

    }

    public static void printMenu() {
        System.out.println("**************MENU***************");
        System.out.println("1. Input book");
        System.out.println("2. Find book by isbn");
        System.out.println("3. Print all books");
        System.out.println("0. Exist!");
    }

    public static void inputBook(List<Book> bookList, Scanner scan) {
        Book book = new Book();
        System.out.print("Please enter isbn: ");
        book.setIsbn(scan.next());
        System.out.print("Please enter Title: ");
        book.setTitle(scan.next());
        System.out.print("Please enter Author Name: ");
        book.setAuthorName(scan.next());
        System.out.print("Please enter year: ");
        book.setYear(scan.nextInt());
        bookList.add(book);
    }

    public static void printAllBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public static void findBookByIsbn(Scanner scan, List<Book> bookList) {
        int count = 0;
        System.out.print("Please enter isbn: ");
        String isbn = scan.next();
        for (Book book : bookList) {
            if (isbn.equals(book.getIsbn())) {
                System.out.println(book);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Book not found");
        }
    }
}

