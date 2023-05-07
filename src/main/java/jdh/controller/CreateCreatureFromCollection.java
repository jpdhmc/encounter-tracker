package jdh.controller;

import jdh.entity.Creature;
import jdh.entity.Encounter;
import jdh.persistence.GenericDao;
import jdh.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/createCreatureFromCollection"}
)
public class CreateCreatureFromCollection extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Creature> dao;
        GenericDao<Encounter> encounterDao;
        dao = DaoFactory.createDao(Creature.class);
        encounterDao = DaoFactory.createDao(Encounter.class);
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("creatureEncounter")));

        Creature newCreature;
        Creature existingCreature = dao.getById(Integer.parseInt(req.getParameter("addFromCollection")));
        newCreature = existingCreature;
        newCreature.setEncounters(creatureEncounter);

        dao.insert(newCreature);

        creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("creatureEncounter")));
        req.setAttribute("selectedEncounter", creatureEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter.jsp");
        dispatcher.forward(req, resp);
    }
}
