public class Book {

   private String title;
   private String author;
   private String id;

    public Book(String title, String author, String id) {
        this.title = title;
        this.author =author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public String getId() {
        String isnb = id;
        return isnb;
    }

    public void displayInfo(){
        System.out.println("Title: " + title + ", " + "Author: " + author + ", " + "Id: " + id);
    }
    /*@Override
    public String toString() { // Переопределяем для понятного вывода
        return "Title:" + title + ", Author:" + author + ", Id:" + id;
    }*/
}
