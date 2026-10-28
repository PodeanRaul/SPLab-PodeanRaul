package ro.uvt.info.lab1sp;

public class UpdateBookCommand implements Command<String> {
    private final BooksService booksService;
    private final Long id;
    private final String bookData;

    public UpdateBookCommand(BooksService booksService, Long id, String bookData) {
        this.booksService = booksService;
        this.id = id;
        this.bookData = bookData;
    }

    @Override
    public String execute() {
        return booksService.updateBook(id, bookData);
    }
}