import java.util.Scanner;

public class ManualLibManagement {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner in = new Scanner(System.in);

        String addIsnb, addAuthor, addTitle;
        Genre addGenre = null;
        int j = 0, i = 0;

        while (true) {
            System.out.println("Выберите действие, которое вы хотите совершить:" +
                    "\n 1 - Добавить книгу " +
                    "\n 2 - Найти книгу \n " +
                    "3 - Удалить книгу");

            i = in.nextInt();
            in.nextLine();

            switch (i) {
                case 1 -> {
                    System.out.println("Добавьте ISNB книги:");
                    addIsnb = in.nextLine();
                    System.out.println("Добавьте автора книги:");
                    addAuthor = in.nextLine();
                    System.out.println("Добавьте название книги:");
                    addTitle = in.nextLine();

                    while (j < 1 || j > 3) {
                        System.out.println("Выберите жанр из списка:\n" + "1-HORROR,\n" + "2-FANTASY,\n" + "3-DRAMA");
                        j = in.nextInt();
                        switch (j) {
                            case 1 -> addGenre = Genre.HORROR;
                            case 2 -> addGenre = Genre.FANTASY;
                            case 3 -> addGenre = Genre.DRAMA;
                            default -> System.out.println("Такой жанр не существует");
                        }
                    }
                    j = 0;
                    library.addBook(new Book(addTitle, addAuthor, addIsnb, addGenre));

                }
                case 2 -> {
                    System.out.println("Введите название книги, которую хотите найти");
                    addTitle = in.nextLine();
                    library.findBookBySearch(addTitle);

                }
                case 3 -> {
                    System.out.println("Введите ISNB книги, которую хотите удалить");
                    addIsnb = in.nextLine();
                    library.removeBookByIsnb(addIsnb);

                }
                default -> {
                    System.out.println("Вы ввели неверный параметр. Введите 1,2 или 3!\n");

                }
            }
        }
    }
}
//test