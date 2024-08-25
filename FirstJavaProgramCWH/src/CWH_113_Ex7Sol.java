import java.util.ArrayList;

public class CWH_113_Ex7Sol {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();

        MyLibrary iitg = new MyLibrary(book);
        iitg.addBook(new Book("Success Story", "Arti Sahu", "Nainar Guruswami", "23-aug-24"));
        iitg.addBook(new Book("Success Story", "Arti Sahu", "Nainar Guruswami", "23-aug-24"));
        iitg.showBook();

        iitg.issueBook(new Book("Success Story", "Arti Sahu", "Nainar Guruswami", "23-aug-24"));
        iitg.showBook();
    }
}

class Book{
    String name, author, issueTo, issueOn;
    Book(String name, String author, String issueTo, String issueOn){
        this.name = name;
        this.author = author;
        this.issueTo = issueTo;
        this.issueOn = issueOn;
    }

}

class MyLibrary{
    ArrayList<Book> books = new ArrayList<>();

    MyLibrary(ArrayList<Book> books){
        this.books = books;
    }

    void addBook(Book b){
        books.add(b);
    }

    void returnBook(Book b){
        books.add(b);
    }

    void issueBook(Book b){
        books.remove(b);
    }

    void showBook(){
        for(Book b: books){
            System.out.println(b);
        }
    }
}
