import java.util.ArrayList;
import java.util.Objects;

public class Library {

    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<Member> membersList = new ArrayList<>();
    ArrayList<Loan> loansList = new ArrayList<>();

    public Library() {
    }

    public void add(Book book) {
        bookList.add(book);
    }

    public void add(Member member) {
        membersList.add(member);
    }
//
//    public Book getBook(int bookID) {
//        for (Book book = bookID; bookList) ;
//        if (Book.getBook() == getBook(bookID))
//            return getBook;
//    }
//        if (getBook == null || getClass() != getBook.getClass()) return false;
//        {
//            Book bookList = (Book) getBook;
//            return Objects.equals(bookList.ID);
//        }
//        return null;
//
    // }
}
//        IO.println(loanList);
//    }
