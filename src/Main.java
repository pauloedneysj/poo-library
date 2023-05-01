import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var library = new Library();

        library.addBook(
                new Book("O futuro da humanidade", "9786555640410", 256,
                new Author("Augusto Cury", "02-10-1958", "Brasileiro", "https://www.ebiografia.com/augusto_cury/"),
                new Publisher("Arqueiro", "Bahia - BA", "(78) 2911-1205")
                ));

        library.addBook(
                new Book("A Culpa É das Estrelas", "9783844906288", 288,
                new Author("John Green", "24-08-1977", "Americano", "https://www.ebiografia.com/john_green/"),
                new Publisher("Moderna", "Natal - RN", "(84) 3611-9995")
                ));

        System.out.println(library.getBooks());
    }
}