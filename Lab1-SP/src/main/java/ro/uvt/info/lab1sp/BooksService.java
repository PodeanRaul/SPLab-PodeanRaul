package ro.uvt.info.lab1sp;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BooksService {
    private final Map<Long, String> books = new HashMap<>();
    private long currentId = 1;

    public List<String> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public String getBookById(Long id) {
        return books.get(id);
    }

    public String addBook(String bookData) {
        long id = currentId++;
        String book = "Book[id=" + id + ", data=" + bookData + "]";
        books.put(id, book);
        return book;
    }

    public String updateBook(Long id, String bookData) {
        String updated = "Book[id=" + id + ", data=" + bookData + "]";
        books.put(id, updated);
        return updated;
    }

    public boolean deleteBook(Long id) {
        return books.remove(id) != null;
    }
}