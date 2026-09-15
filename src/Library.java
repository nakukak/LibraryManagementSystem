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

//    @Override
//    public Book getBook (int ID) {
//        if (getBook == null || getClass() != getBook.getClass()) return false;
//        {
//            Book bookList = (Book) getBook;
//            return Objects.equals(bookList.ID);
//        }
//        return null;
//
//        Book getBook (int ID) {
//        for(Book book = bookList) return false
//
//            if (Book.getBook() == bookID())
//                    return getBook;
       // }
    }
//        IO.println(loanList);
//    }
