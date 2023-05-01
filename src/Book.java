import java.text.Normalizer;
import java.util.regex.Pattern;

public class Book {
    private String title;
    private String ISBN;
    private int numberOfPages;
    private Author author;
    private Publisher publisher;

    public Book(String title, String ISBN, int numberOfPages, Author author, Publisher publisher){
        this.title = title;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publisher = publisher;
    }

    public String getISBN() { return ISBN; }

    public int getNumberOfPages() { return numberOfPages; }

    public String getTitle() { return title; }

    public String getFormattedTitle() { return formatString(title); }

    public static String formatString(String str) {
        String finalString = str.replaceAll("\\s", "").toLowerCase();
        String nfdNormalizedString = Normalizer.normalize(finalString, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(nfdNormalizedString).replaceAll("").toLowerCase();
    }

    @Override
    public String toString(){
        return String.format(
                "\nTitulo: %s" +
                "\nAutor: %s " +
                "\nEditora: %s " +
                "\nISBN: %s " +
                "\nNúmero de páginas: %s ", title, author.getName(), publisher.getName(), ISBN, numberOfPages
        );
    }
}
