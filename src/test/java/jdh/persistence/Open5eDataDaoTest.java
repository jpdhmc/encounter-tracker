package jdh.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Open5eDataDaoTest {

    @Test
    void getMonster() {
        Open5eDataDao dao = new Open5eDataDao();
        assertEquals(dao.getMonster("bandit").getHitPoints(), 11);
        assertEquals(dao.getMonster("lich").getName(), "Lich");
        assertEquals(dao.getMonster("fire-giant-war-priest-a5e").getSlug(), "fire-giant-war-priest-a5e");
    }


    @Test
    void getMonstersByName() {
        Open5eDataDao dao = new Open5eDataDao();
        assertEquals(5, dao.getMonstersByName("bandit").size());
    }
}