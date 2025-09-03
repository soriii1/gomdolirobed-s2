import java.util.ArrayList;
import java.util.Objects;

public class library {
    String name;

    void borrowBook(Users name, Book bookLoan, Users borrowCount){
        if (bookLoan.bookLoan == true){
            System.out.println("다른 사람이 대출한 책은 대출하실 수 없습니다.");
            return;
        }
        if (borrowCount.borrowCount >= 2){
            System.out.println("최대 두 권의 책만 대출 가능합니다.");
        }
        else{
            bookLoan.bookLoan = true;
            borrowCount.borrowCount +=1;
            bookLoan.borrowUser = name.name;
            System.out.println("대출이 완료되었습니다.");
        }
    }


    void returnBook(Users name, Book bookLoan, Users borrowCount){
        if (bookLoan.bookLoan == false){
            System.out.println("대출되지 않은 책입니다.");
        }
        else{
            bookLoan.bookLoan = false;
            borrowCount.borrowCount -=1;
            bookLoan.borrowUser = "-";
            System.out.println("반납 완료되었습니다.");
        }
    }

    void borrowUser(ArrayList<Book> books,Users user){
        for (Book book : books){
            if (book.borrowUser.equals(user.name)){
                System.out.println(book.name);
            }
        }
    }



}
