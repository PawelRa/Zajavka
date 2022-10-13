package objectExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        arrayListOfBooks();
        listOfBooks();
    }


    private static void arrayListOfBooks() {
        Book book1 = new Book("Pan Wołodyjowski", "13545536-5456-564-541", "Sienkiewicz");
        Book book2 = new Book("Potop", "54542-54-534-524", "Sienkiewicz");
        Book book3 = new Book("Historia Adeli", "978-83-8083-681-5", "Magdalena Knedler");
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        ArrayList<Book> firstLetterHBooks = new ArrayList<>();
        for (Book listOfBook : listOfBooks) {
            if (listOfBook.getTitle().startsWith("H")) {
                firstLetterHBooks.add(listOfBook);
            }
        }
        System.out.println(firstLetterHBooks);
    }

    private static void listOfBooks() {
        Book book1 = new Book("Pan Wołodyjowski", "13545536-5456-564-541", "Sienkiewicz");
        Book book2 = new Book("Potop", "54542-54-534-524", "Sienkiewicz");
        Book book3 = new Book("Historia Adeli", "978-83-8083-681-5", "Magdalena Knedler");
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Book[] books = new Book[3];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        int howManyBooks = 0;
        for (Book book : books) {
            if (book.getTitle().startsWith("H")) {
                howManyBooks++;
            }
        }
        Book[] firstLetterHBooks = new Book[howManyBooks];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (books[i].getTitle().startsWith("H")) {
                firstLetterHBooks[j] = books[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(books));
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(firstLetterHBooks));
    }
}
