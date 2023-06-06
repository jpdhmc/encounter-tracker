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
        urlPatterns = {"/updateCreature"}
)
public class UpdateCreature extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Encounter> encounterDao = DaoFactory.createDao(Encounter.class);
        GenericDao<Creature> creatureDao = DaoFactory.createDao(Creature.class);
        Creature selectedCreature = creatureDao.getById(Integer.parseInt(req.getParameter("editingCreature")));
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("selectedEncounter")));

        selectedCreature.setCreatureName(req.getParameter("creatureName"));
        selectedCreature.setMaxHitpoints(Integer.parseInt(req.getParameter("creatureMaxHitpoints")));
        creatureDao.saveOrUpdate(selectedCreature);
        selectedCreature = creatureDao.getById(Integer.parseInt(req.getParameter("editingCreature")));

        req.setAttribute("selectedEncounter", creatureEncounter);
        req.setAttribute("selectedCreature", selectedCreature);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter");
        dispatcher.forward(req, resp);
    }
}
