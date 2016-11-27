package example;

import javax.jws.WebService;

@WebService(endpointInterface = "example.IBookService")
public class BookService implements IBookService {

    @Override
    public Book getBook(Integer id) {
        Book book = new Book();
        book.setId(id);
        book.setAuthor("uncle bob");
        book.setTitle("clean code");
        return book;
    }

    @Override
    public void addBook(Book book) {
        System.out.println(book);
    }
}
