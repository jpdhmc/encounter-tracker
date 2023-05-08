package jdh.controller;

import jdh.entity.Encounter;
import jdh.open5edata.Monster;
import jdh.persistence.GenericDao;
import jdh.persistence.Open5eDataDao;
import jdh.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/createCreatureFromSearch"}
)
public class CreateCreatureFromSearch extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Open5eDataDao openDao = new Open5eDataDao();
        GenericDao<Encounter> encounterDao = DaoFactory.createDao(Encounter.class);
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("creatureEncounter")));
        List<String> monsterNameList = openDao.getMonstersByName(req.getParameter("searchCreature"));
        List<Monster> monsterList = new ArrayList<>();
        for (String monsterName : monsterNameList) {
            Monster monster = openDao.getMonster(monsterName);
            monsterList.add(monster);
        }

        req.setAttribute("monsterList", monsterList);
        req.setAttribute("selectedEncounter", creatureEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/monsterResults.jsp");
        dispatcher.forward(req, resp);
    }
}
