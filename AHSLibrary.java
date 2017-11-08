public class AHSLibrary {
    public static void main(String[] args) {
        Library ahs = new Library("Acalanes", 10);
        Author author1 = new Author(97, "Harriet Tubmna");
        Book book1 = new Book(author1, "To Kill a Mockingbird");
        System.out.println(ahs);
    }
}