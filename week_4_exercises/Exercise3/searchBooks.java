@GetMapping("/search")
public List<Book> searchBooks(
        @RequestParam(required = false) String title,
        @RequestParam(required = false) String author) {
    return books.stream()
            .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
                            (author == null || book.getAuthor().equalsIgnoreCase(author)))
            .toList();
}
