package jdh.persistence;

import jdh.entity.Creature;
import jdh.entity.Encounter;
import jdh.entity.User;
import jdh.test.util.DaoFactory;
import jdh.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class - Creature Dao
 *
 * @author John Den Hartog
 */
class CreatureDaoTest {
    GenericDao<Creature> dao;
    GenericDao<User> encounterDao;

    /**
     * Sets up new dao and resets database before each test
     */
    @BeforeEach
    void setUp() {
        dao = DaoFactory.createDao(Creature.class);
        encounterDao = DaoFactory.createDao(Encounter.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies getAllCreatures
     */
    @Test
    void getAllCreaturesSuccess() {
        List<Creature> creatures = dao.getAll();
        assertEquals(1, creatures.size());
    }

    /**
     * Verifies insert
     */
    @Test
    void insertSuccess() {
        Encounter encounter = encounterDao.getById(1);
        Creature newCreature = new Creature("insertcreaturetest", encounter, 32);
        int id = dao.insert(newCreature);
        Creature insertedCreature = dao.getById(id);
        assertEquals("insertcreaturetest", insertedCreature.getCreatureName());
    }

    /**
     * Verifies update
     */
    @Test
    void updateSuccess() {
        String newCreatureName = "brandnewcreaturename";
        Creature creatureToUpdate = dao.getById(1);
        creatureToUpdate.setCreatureName(newCreatureName);
        creatureToUpdate.setMaxHitpoints(100);
        dao.saveOrUpdate(creatureToUpdate);
        Creature retrievedCreature = dao.getById(1);
        assertEquals(newCreatureName, retrievedCreature.getCreatureName());
        assertEquals(100, retrievedCreature.getMaxHitpoints());
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