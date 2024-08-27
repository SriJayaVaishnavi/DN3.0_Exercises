import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Operation(summary = "Get a book by its ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the book",
          content = { @Content(mediaType = "application/json",
          schema = @Schema(implementation = Book.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied",
          content = @Content),
        @ApiResponse(responseCode = "404", description = "Book not found",
          content = @Content) })
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Implementation here
        return new Book(id, "Effective Java", "Joshua Bloch", 45.00);
    }
}
