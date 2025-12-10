public class Book {

    private String title;
    private String author;
    private String isnb;

    public Book(String title, String author, String isnb) {
        this.title = title;
        this.author = author;
        this.isnb = isnb;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsnb() {
        return isnb;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Isnb: " + isnb);
    }
    /*@Override
    public String toString() { // Переопределяем для понятного вывода
        return "Title:" + title + ", Author:" + author + ", Id:" + id;
    }*/
}
