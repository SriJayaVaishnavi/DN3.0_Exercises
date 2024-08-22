@GetMapping("/{id}")
public Book getBookById(@PathVariable Long id) {
    return books.stream()
            .filter(book -> book.getId().equals(id))
            .findFirst()
            .orElse(null); // You can also throw an exception if the book is not found
}
