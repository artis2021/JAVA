public class CWH_61_Ex4Sol {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think & Grow Rich.");
        centralLibrary.showAvailableBook();
    }
}

class Library{
    String [] books;
    int i;
    Library(){
        this.books = new String[100];
        this.i = 0;
    }
    void addBook(String book){
        books[i] = book;
        i++;
        System.out.println(book+ " has been added.");
    }
    void issueBook(){

    }
    void returnBook(){

    }
    void showAvailableBook(){
        for(String b : books){
            if(b == null) break;
            System.out.println(b);
        }
    }
}