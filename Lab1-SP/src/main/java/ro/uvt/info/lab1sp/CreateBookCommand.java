package ro.uvt.info.lab1sp;

public class CreateBookCommand implements Command<String> {
    private final BooksService booksService;
    private final String bookData;

    public CreateBookCommand(BooksService booksService, String bookData) {
        this.booksService = booksService;
        this.bookData = bookData;
    }

    @Override
    public String execute() {
        return booksService.addBook(bookData);
    }
}
