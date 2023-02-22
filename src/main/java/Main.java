import entity.Author;
import entity.Book;
import org.jboss.logging.Logger;

import java.util.List;


public class Main {

    private static final Logger LOG = Logger.getLogger(AuthorHelper.class.getName() );
    private static final Logger LOG1 = Logger.getLogger(BookHelper.class.getName());

    public static void main(String[] args) {
                   AuthorHelper ah = new AuthorHelper();
                   BookHelper bh = new BookHelper();
                   Author author = new Author();
                   Book book = new Book();
//-----------------------------------------------------------------------------------------------
//                 bh.getBookAndAuthorById(1);// -  метод, который получает название книг и имя автора.

// можем получить  название книг и имя автора и таким способом.
//                 Book book1 = bh.getBookById(1) ;
//                 Author author1 = ah.getAuthorById(book1.getAuthorId());
//                 System.out.print("Назва книги "+ book1.getName() + " Автор книги " + author1.getName());
//-----------------------------------------------------------------------------------------------
// Из пакета ex_002_insert_and_update создайте в цикле 200 объектов author и сохраните в БД.
// Значения полей могут быть любыми.
// Используйте метод flush для каждых 10 объектов. Метод сommit выполняйте один раз в конце.

                   ah.addAuthor(null);
//------------------------------------------------------------------------------------------------

//К дополнительному заданию добавить метод обновления имени автора по id.
// Аналогично сделать и в классе BookHelper с предыдущего ДЗ.

//                 Author author1 = ah.getAuthorById(2);
//                 author1.setName("Shevchenko");
//                 ah.getNameAuthor (author1);
//
//                 Book book1 = bh.getBookById(2);
//                 book1.setName("New name");
//                 bh.getNameBook(book1);


    }




}

