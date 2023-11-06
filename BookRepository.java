public class BookRepository extends from JpaRepository<Book,Integer>{
    public List<Book> findAll();
    public Book findBookById(int BookId);
}
