package jdh.persistence;

import jdh.entity.Encounter;
import jdh.entity.User;
import jdh.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class - Encounter DAO
 *
 * @author John Den Hartog
 */
class EncounterDaoTest {
    EncounterDao dao;
    /**
     * Sets up new dao and resets database before each test
     */
    @BeforeEach
    void setUp() {
        dao = new EncounterDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies getAllEncounters
     */
    @Test
    void getAllEncountersSuccess() {
        List<Encounter> encounters = dao.getAllEncounters();
        assertEquals(3, encounters.size());
    }

    /**
     * Verifies getByPropertyLike
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Encounter> encounters = dao.getByPropertyLike("encounterName", "test");
        assertEquals(2, encounters.size());
    }

    /**
     * Verifies getById
     */
    @Test
    void getByIdSuccess() {
        Encounter retrievedEncounter = dao.getById(1);
        assertEquals("test goblins", retrievedEncounter.getEncounterName());
    }

    /**
     * Verifies insert
     */
    @Test
    void insertSuccess() {
        UserDao userDao = new UserDao();
        User user = userDao.getById(1);
        Encounter newEncounter = new Encounter("brand new encounter", user);
        user.addEncounter(newEncounter);
        int id = dao.insert(newEncounter);

        Encounter insertedEncounter = dao.getById(id);
        assertEquals("brand new encounter", insertedEncounter.getEncounterName());
        assertEquals("jdhtest", insertedEncounter.getUser().getUsername());
    }

    /**
     * Verifies update
     */
    @Test
    void updateSuccess() {
        String newEncounterName = "cool encounter name";
        Encounter encounterToUpdate = dao.getById(2);
        encounterToUpdate.setEncounterName(newEncounterName);
        dao.saveOrUpdate(encounterToUpdate);
        Encounter retrievedEncounter = dao.getById(2);
        assertEquals(newEncounterName, retrievedEncounter.getEncounterName());
    }

    /**
     * Verifies delete
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));
    }
}