
import entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.*;
import java.util.List;


public class AuthorHelper {

    private SessionFactory sessionFactory;

    public AuthorHelper() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    public Author getAuthorById(long id) {
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, id);
        session.close();
        return author;
    }

    public Author addAuthor(Author author) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        for (int i = 1; i < 200; i++) {
            session.save(new Author("name" + i));
            if (i % 10 == 0) {
                System.out.println("-----------------flush()-----------------");
                session.flush();
            }
        }
        session.getTransaction().commit();
        session.close();
        return author;
    }
        public Author getNameAuthor(Author author){

            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Author a1 = session.get(Author.class, author.getId());
            a1.setName(author.getName());
            session.save(a1);
            session.getTransaction().commit();
            session.close();

            return author;

    }
}

