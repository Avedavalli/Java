public  class BookService{
    @Autowired
    private BookRepository bookRepository;
    public getBooks(){
     List<Book> bookList= bookRepository.findAllBooks()
        return bookList
    }

    public getBookById(int id){
       optional<Book> book=bookRepository.findById(id);

    }

    public addBook(Book book){
       bookRepository.save(book);
    }

    public addAllBooks(List<Book> books){
        bookRepository.saveAll(books);
    }

    public updateBook(Book book){
      Book book=bookRepository.findById(book.getId);
      book.setName(book.getName);
      book.setAuthor(book.getAuthor);
      bookRepository.saveorUpdate(book);
    }
    public DeleteBook(int bookId){
       bookRepository.deleteById(bookId);
    }
}
