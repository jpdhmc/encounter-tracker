package jdh.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Open5eDataDaoTest {

    @Test
    void getMonster() {
        Open5eDataDao dao = new Open5eDataDao();
        assertEquals(dao.getMonster("bandit").getHitPoints(), 11);
        assertEquals(dao.getMonster("bandit").getName(), "Bandit");
    }

    @Test
    void
}