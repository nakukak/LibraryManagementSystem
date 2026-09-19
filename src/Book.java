import java.util.Objects;

public class Book {

    class Record {
    }

    ;

    private final String AUTHOR;
    private final String BOOKNAME;
    private final String ISBN;
    private final int bookID;

    public Book(String AUTHOR, String BOOKNAME, String ISBN, int bookID) {
        this.AUTHOR = AUTHOR;
        this.BOOKNAME = BOOKNAME;
        this.ISBN = ISBN;
        this.bookID = bookID;
    }

    public String toString() {
        return String.format("""
                Bog: %s, %s, %s, %d
                """, AUTHOR, BOOKNAME, ISBN, bookID);
    }
}
//
//    @Override
//    public boolean equals(Object otherObj) {
//        if (otherObj == null || getClass() != otherObj.getClass()) return false;
//        Book books = (Book) otherObj;
//        return Objects.equals(BOOKNAME, books.BOOKNAME) && Objects.equals(AUTHOR, books.AUTHOR);
//        boolean isBookFound = books.contains();
//        IO.println(isBookFound);
//    }
//
//    @Override
//    public boolean equals(Object otherBooks) {
//        if (otherBooks == null || getClass() != otherBooks.getClass()) return false;
//        Book otherBook = (Book) otherBooks;
//        return Objects.equals(AUTHOR, otherBook.AUTHOR) &&
//                Objects.equals(BOOKNAME, otherBook.BOOKNAME) &&
//                Objects.equals(ISBN, otherBook.ISBN) &&
//                Objects.equals(bookID, otherBook.bookID);
//    }
//
//}
//

//    public boolean bookLoan() {
//        if (isAvailable) {
//            isAvailable = false;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void returnBook() {
//        isAvailable = true;}
//
//    public String toString() {
//        String status = isAvailable ? "Tilgengelig" : "Udlånt";
//
//        return String.format("""
//                 %s
//                 %s
//                 %s
//                 %s
//                 %s
//                """, "Forfatter" + AUTHOR, "Bognavn: " + BOOKNAME, "ISBN Number: " + ISBN, "Bog ID: " + (ID), status);


//    boolean balance = true;
//    while (balance) {
//        IO.println("Hvad vil du");
//        IO.println("1. Indlån");
//        IO.println("2. Udlån");
//        IO.println("3. Exit");
//        int menuChoice = Integer.parseInt(IO.readln("Vælg et redskab fra menuen: "));
//        if (menuChoice == 1) {
//            IO.println("menupunkt 1");
//            String backOrExit = IO.readln("Tryk Enter for at komme tilbage til hovedmenuen, eller e for exit");
//            if (backOrExit.equals("e")) {
//                systemIsRunning = false;
//            }