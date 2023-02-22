
import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;


public class BookHelper {
    private SessionFactory sessionFactory;

    public BookHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }



    public Book getBookById(long id) {
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);
        session.close();
        return book;
    }

       public Book getNameBook(  Book book){

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Book book1 = session.get(Book.class, book.getId());
        book1.setName(book.getName());
        session.save(book1);
        session.getTransaction().commit();
        session.close();
        return book;
  }


    public void getBookAndAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Book book = session.get(Book.class, id);
        Author author = session.get(Author.class, id);
        session.close();
        System.out.println(author.getName() + " " + author.getLastName() + " " + book.getName());
    }

}
