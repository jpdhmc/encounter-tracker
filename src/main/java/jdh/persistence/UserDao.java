package jdh.persistence;

import jdh.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * User Data Access Object
 *
 * @author John Den Hartog
 */
public class UserDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public List<User> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        List<User> users = session.createQuery(query).getResultList();
        session.close();
        logger.info("all users: ");
        for (User listUser : users) {
            logger.info(listUser.toString());
        }
        return users;
    }

    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();
        logger.info("user by id: " + user);
        return user;
    }

    public int insert(User user) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(user);
        transaction.commit();
        session.close();
        logger.info("inserted user: " + user);
        return id;
    }
}
