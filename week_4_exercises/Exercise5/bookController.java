import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null); // Replace `null` with a custom exception if needed

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Book-Header-Value");

        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        books.add(book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Book-Added-Header");

        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                book.setTitle(bookDetails.getTitle());
                book.setAuthor(bookDetails.getAuthor());
                book.setPrice(bookDetails.getPrice());
                book.setIsbn(bookDetails.getIsbn());

                HttpHeaders headers = new HttpHeaders();
                headers.add("Custom-Header", "Book-Updated-Header");

                return new ResponseEntity<>(book, headers, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        books.removeIf(book -> book.getId().equals(id));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Book-Deleted-Header");

        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }
}
