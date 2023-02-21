package jdh.persistence;

import jdh.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
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

    /**
     * Gets all users.
     *
     * @return all users
     */
    public List<User> getAllUsers() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        List<User> users = session.createQuery(query).getResultList();
        session.close();
        logger.info("GET ALL USERS: ");
        for (User listUser : users) {
            logger.info(listUser.toString());
        }
        return users;
    }

    /**
     * Gets a user by property with a value similar to entered value
     *
     * @param propertyName the property name
     * @param value        the value
     * @return users
     */
    public List<User> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.info("GET BY " + propertyName + " like " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> query = builder.createQuery(User.class);
        Root<User> root = query.from(User.class);
        Expression<String> propertyPath = root.get(propertyName);
        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<User> users = session.createQuery(query).getResultList();
        session.close();
        return users;
    }

    /**
     * Gets user by id.
     *
     * @param id the id
     * @return the id
     */
    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();
        logger.info("GET USER BY ID: " + user);
        return user;
    }

    /**
     * Insert a user
     *
     * @param user the user
     * @return the id of the inserted user
     */
    public int insert(User user) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(user);
        transaction.commit();
        session.close();
        logger.info("INSERTED USER: " + user);
        return id;
    }

    /**
     * Save or update a user
     *
     * @param user the user
     */
    public void saveOrUpdate(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
        logger.info("UPDATED NAME: " + user.getUsername());
    }

    /**
     * Delete a user
     *
     * @param user the user
     */
    public void delete(User user) {
        logger.info("DELETING USER: " + user);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
}
