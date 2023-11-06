@RestController
@RequestMapping("/books")
public class BookController{
    @Autowired
    public BookService;
    @GetMapping("/get")
    public getBooks(){
       List<Book> bookList=Bookservice.getAllBooks();
       return ResponseEntity<Book>;
    }
    @GetMapping("/get/{id}")
    public getBooksById(@PathParam("id") int id){
        Book book=BookService.getBookById(id);
        return ResponseEntity<book>
    }
    @PostMapping("/add")
    public addBook(@RequestBody book){
        BookService.addBook(book);
    }
    @PostMapping("/addAll")
    public addAllBooks(@RequestBody List<Book> books){
        BookService.addAllBooks(books);
    }
    @PutMapping("/update/{id}")
    public updateBook(@RequestBody Book book){
        BookService.updateBook(book);
    }
    @DeleteMapping("/remove/{id}")
    public DeleteBook(@PathParam int bookId){
        BookService.deleteBookById(bookId)
    }
}
