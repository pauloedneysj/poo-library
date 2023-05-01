import java.util.ArrayList;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addBooks(ArrayList<Book> books) {
        this.books.addAll(books);
    }

    public String getBooks() {
        return books.toString();
    }

    public Book getBookForTitle(String title){
        var optionalBook = books.stream().filter(book -> book.getFormattedTitle().equals(formatString(title))).findFirst();

        if (optionalBook.isPresent()) { return optionalBook.get(); }
        throw new RuntimeException("Livro não encontrado.");
    }

    public static String formatString(String str) {
        String finalString = str.replaceAll("\\s", "").toLowerCase();
        String nfdNormalizedString = Normalizer.normalize(finalString, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("").toLowerCase();
    }
}
