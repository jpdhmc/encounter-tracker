package jdh.entity;

import jdh.open5edata.Monster;
import jdh.persistence.EncounterDao;
import jdh.persistence.GenericDao;
import jdh.persistence.Open5eDataDao;
import jdh.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jdh.test.util.DaoFactory;

public class CreatureTest {
    GenericDao<Creature> creatureDao;
    Open5eDataDao openDao;
    GenericDao<Encounter> encounterDao;

    @BeforeEach
    void setUp() {
        creatureDao = DaoFactory.createDao(Creature.class);
        openDao = new Open5eDataDao();
        encounterDao = DaoFactory.createDao(Encounter.class);
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void convertFromMonsterSuccess() {
        Monster foundMonster;
        foundMonster = openDao.getMonster("Bandit");
    }
}
