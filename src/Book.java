import java.util.HashMap;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private Integer year;

    Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Book book = (Book) obj;
        return ((title == book.title
                ||(title != null && title.equals(book.title)))
                && (author == book.author
                    || (author != null && author.equals(book.author)))
                && (year == book.year
                    ||(year != null && year.equals(book.year))));
    }

    @Override
    public int hashCode() {
        String tay = this.title + this.author + this.year;
        return tay.hashCode();

    }

    public static void main(String[] args) {
        HashMap<Book, String> books = new HashMap<>();

        addBook(books,new Book("Иван да Марья", "Пушкин", 2000), "2");
        addBook(books,new Book("Война и мир", "Толстой", 2024), "5");
        addBook(books,new Book("Горе от ума", "Грибоедов", 2010), "99");

        Book bookForDel = new Book("Иван да Марья", "Пушкин", 2000);
        Book bookForDelNotValid = new Book("Иван да Марья", "Я", 2000);
        System.out.println("до удаления " + books);

        findBook(books,bookForDelNotValid);
        removeBook(books,bookForDel);
        showAllbooks(books);
    }

    public static void addBook(HashMap<Book,String> hashMap, Book book, String str) {
        hashMap.put(book, str);
    }

    public static void removeBook(HashMap<Book,String> hashMap,Book book) {
        for (Map.Entry<Book,String> entry: hashMap.entrySet()) {

            if (entry.getKey().equals(book)){
                System.out.println("Книга " + entry.getKey().title + " находилась на полке " + entry.getValue());
            }
        }
        hashMap.remove(book);
    }

    public static void findBook(HashMap<Book,String> bookMap,Book book) {
        System.out.println("Попытка найти книгу");

        for (Map.Entry<Book,String> entry: bookMap.entrySet()) {
            if (entry.getKey().equals(book)){
                System.out.println("Книга " + entry.getKey().title + " находится на полке " + entry.getValue());
            }
        }
    }

    public static void showAllbooks(HashMap<Book,String> bookMap){
        for (Map.Entry<Book,String> entry:bookMap.entrySet()
             ) {
            System.out.println("Кгига " + entry.getKey().title + " Аатора " + entry.getKey().author
                    + " года выпуска " + entry.getKey().year + " находится на " + entry.getValue() + " полке");
        }
    }

}
