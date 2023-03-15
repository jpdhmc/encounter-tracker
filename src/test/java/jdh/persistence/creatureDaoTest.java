package jdh.persistence;

import jdh.entity.Creature;
import jdh.entity.User;
import jdh.test.util.DaoFactory;
import jdh.test.util.Database;
import org.junit.jupiter.api.AfterEach;
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

    /**
     * Sets up new dao and resets database before each test
     */
    @BeforeEach
    void setUp() {
        dao = DaoFactory.createDao(Creature.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Verifies getAllUsers
     */
    @Test
    void getAllCreaturesSuccess() {
        List<Creature> creatures = dao.getAll();
        assertEquals(1, creatures.size());
    }
}