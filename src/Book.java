public class Book extends library{
    String name;
    String author;
    String isbn;
    Boolean bookLoan;
    String loanUser;
    String borrowUser;

    Book(String borrowUser, String name, String author, String isbn, Boolean bookLoan){
        this.borrowUser = null;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.bookLoan = false;
    }

}