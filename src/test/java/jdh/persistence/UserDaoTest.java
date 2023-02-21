package jdh.persistence;

import jdh.entity.User;
import jdh.test.util.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class UserDaoTest {
    UserDao dao;
    @BeforeEach
    void setUp() {
        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(3, users.size());
    }

    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(1);
        assertEquals("jdhtest", retrievedUser.getUsername());
    }


    @Test
    void insertSuccess() {
        User newUser = new User("JohnDAOTest", "daopass");
        int id = dao.insert(newUser);
        User insertedUser = dao.getById(id);
        assertEquals("JohnDAOTest", insertedUser.getUsername());
    }

    @Test
    void updateSuccess() {
        String newUsername = "coolnewname43";
        User userToUpdate = dao.getById(3);
        userToUpdate.setUsername(newUsername);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(3);
        assertEquals(newUsername, retrievedUser.getUsername());
    }

    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }

}