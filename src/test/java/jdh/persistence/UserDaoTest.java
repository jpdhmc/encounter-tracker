package jdh.persistence;

import jdh.entity.User;
import jdh.test.util.DaoFactory;
import jdh.test.util.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class - User DAO
 *
 * @author John Den Hartog
 */
class UserDaoTest {
    GenericDao<User> dao;

    /**
     * Sets up new dao and resets database before each test
     */
    @BeforeEach
    void setUp() {
        dao = DaoFactory.createDao(User.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies getAllUsers
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAll();
        assertEquals(3, users.size());
    }

    /**
     * Verifies findByPropertyEqual
     */
    @Test
    void findByPropertyEqualSuccess() {
        List<User> users = dao.findByPropertyEqual("username", "secondtestname");
        assertEquals(1, users.size());
    }

    /**
     * Verifies getById
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertEquals("jdhtest", retrievedUser.getUsername());
    }


    /**
     * Verifies insert
     */
    @Test
    void insertSuccess() {
        User newUser = new User("JohnDAOTest", "daopass");
        int id = dao.insert(newUser);
        User insertedUser = dao.getById(id);
        assertEquals("JohnDAOTest", insertedUser.getUsername());
    }

    /**
     * Verifies update
     */
    @Test
    void updateSuccess() {
        String newUsername = "coolnewname43";
        User userToUpdate = dao.getById(3);
        userToUpdate.setUsername(newUsername);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(newUsername, retrievedUser.getUsername());
    }

    /**
     * Verifies delete
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

}