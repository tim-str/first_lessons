package animals;

public class DefaultClass extends Animal {
    public DefaultClass(String name) {
        super(name);
    }

    public void tst(){
        System.out.println(this.name);
    }
}

class Library{
//    int qu = 90;
//    Book book[] = new Book[this.qu];
//
//    public void put(Book book, int quant){
//        if () {
//
//        }
//        this.qu = this.qu - quant;
//    }
//    public Book getBook(Book book, int q){
//        if () {
//
//        }
//        return book;
//    }

    public static void main(){
//        Library lb = new Library();
//        Book book = new Book("Title");
//        lb.put(book, 50);
//        lb.getBook(book, 4);
//        lb.put(new Book("Title 4"), 100);
    }
}

class Book{
    String title;
    public Book(String title){
        this.title = title;
    }


}
