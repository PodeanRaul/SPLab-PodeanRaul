package ro.uvt.info.lab1sp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllBooks() {
        Command<List<String>> cmd = new GetAllBooksCommand(booksService);
        return new ResponseEntity<>(cmd.execute(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getBookById(@PathVariable("id") Long id) {
        Command<String> cmd = new GetBookByIdCommand(booksService, id);
        String book = cmd.execute();
        if (book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody String bookData) {
        Command<String> cmd = new CreateBookCommand(booksService, bookData);
        return new ResponseEntity<>(cmd.execute(), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBook(@PathVariable("id") Long id, @RequestBody String bookData) {
        Command<String> cmd = new UpdateBookCommand(booksService, id, bookData);
        return new ResponseEntity<>(cmd.execute(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
        Command<Boolean> cmd = new DeleteBookCommand(booksService, id);
        boolean deleted = cmd.execute();
        if (!deleted) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
    }
}