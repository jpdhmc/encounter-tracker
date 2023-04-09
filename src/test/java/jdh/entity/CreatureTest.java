package jdh.entity;

import jdh.open5edata.Monster;
import jdh.persistence.EncounterDao;
import jdh.persistence.GenericDao;
import jdh.persistence.Open5eDataDao;
import jdh.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import jdh.test.util.DaoFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        Encounter retrievedEncounter = encounterDao.getById(1);
        Monster foundMonster;
        Creature newCreature = new Creature();
        foundMonster = openDao.getMonster("bandit");
        newCreature = newCreature.convertFromMonster(foundMonster, retrievedEncounter);

        int id = creatureDao.insert(newCreature);
        assertEquals("Bandit", newCreature.getCreatureName());
    }
}
