import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // TODO-1 도서관 생성
        // 부산소프트웨어마이스터고등학교 도서관(이하 도서관)을 생성합니다. 도서관에는 다음과 같은 책들이 있습니다.
        // 자바의 정석 저자 남궁성 ISBN 9788994492032
        // 객체지향의 사실과 오해 저자 조영호 ISBN 9788998139766
        // 모던 자바 인 액션 저자 라울 게이브리얼 우르마 ISBN 9791162242025

        library library = new library();
        library.name = "부산소프트웨어마이스터고등학교 도서관";

        Book b1;
        b1 = new Book("-", "자바의 정석", "님궁성", "9788994492032", false);
        Book b2;
        b2 = new Book("-","객체지향의 사실과 오해", "조영호", "9788994492032", false);
        Book b3;
        b3 = new Book("-","모던 자바 인 액샨", "라울 게이브리얼 우르마","9791162242025", false );

        ArrayList<String> books = new ArrayList<>();
        ArrayList<Book> bookList = new ArrayList<>();
        books.add(b1.name);
        books.add(b2.name);
        books.add(b3.name);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);



        // TODO-2 이용자 생성
        // 도서관 이용자 이밤돌을 생성합니다.
        // 도서관 이용자 김이로를 생성합니다.
        Users u1;
        u1 = new Users();
        u1.name="이밤돌";
        u1.borrowCount=0;
        Users u2;
        u2 = new Users();
        u2.name="김이로";
        u2.borrowCount=0;



        // TODO-3 도서 추가
        // 도서관에 모던 자바 인 액션 저자 라울-게이브리얼-우르마 ISBN 9791162242025 이 한권 더 들어옵니다.
        Book b4;
        b4 =  new Book("-","모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025", false);
        books.add(b4.name);
        bookList.add(b4);


        // TODO-4 도서 대출
        // 이밤돌이 도서관에서 자바의 정석을 대출합니다.
        library.borrowBook(u1, b1, u1);

        // 이밤돌이 도서관에서 모던 자바 인 액션을 대출합니다.
        library.borrowBook(u1, b3, u1);

        // 김이로가 도서관에서 모던 자바 인 액션을 대출합니다.
        library.borrowBook(u2, b4, u2);


        // TODO-5 이밤돌 도서 초과 대출 시도
        // 이밤돌이 도서관에서 객체지향의 사실과 오해를 대출합니다.
        // 대출은 정상적으로 처리되지 않고, 최대 2권이 책까지만 대출할 수 있다는 메시지를 출력합니다.
        library.borrowBook(u1, b2, u1);


        // TODO-6 이밤돌 도서 반납
        // 이밤돌이 도서관에 자바의 정석을 반납합니다.
        library.returnBook(u1, b1, u1);


        // TODO-7 이밤돌 도서 대출
        // 이밤돌이 도서관에서 객체지향의 사실과 오해를 대출합니다.
        library.borrowBook(u1, b2, u1);


        // TODO-8 김이로 이미 대출된 도서 대출 시도
        // 김이로가 도서관에서 객체지향의 사실과 오해를 대출합니다.
        // 이밤돌이 이미 대출했으므로 대출은 정상적으로 처리되지 않고, 다른 사람이 대출한 책은 대출할 수 없다는 메시지를 출력합니다.
        library.borrowBook(u2, b2, u2);


        // TODO-9 이밤돌 도서 반납
        // 이밤돌이 도서관에 객체지향의 사실과 오해를 반납합니다.
        library.returnBook(u1, b2, u1);


        // TODO-10 김이로 도서 대출
        // 김이로가 도서관에서 객체지향의 사실과 오해를 대출합니다.
        library.borrowBook(u2, b2, u2);

        // TODO-11 김이로 대출하지 않은 책 반납 시도
        // 김이로가 도서관에 자바의 정석 반납합니다.
        // 반납은 정상적으로 처리되지 않고, 대출하지 않은 책은 반납할 수 없다는 메시지를 출력합니다.
        library.returnBook(u2, b1, u2);

        // TODO-12 전체 조회
        // 도서관에서 도서 목록을 조회합니다.
        for (String b : books) {
            System.out.println(b);
        }


        // 이밤돌이 본인이 대출한 도서를 조회합니다.
        library.borrowUser(bookList,u1);

        // 김이로가 본인이 대출한 도서를 조회합니다.
        library.borrowUser(bookList,u2);
    }
}