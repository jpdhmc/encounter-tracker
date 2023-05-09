package jdh.controller;

import jdh.entity.Creature;
import jdh.entity.Encounter;
import jdh.entity.User;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/addConvertedCreatureToEncounter"}
)
public class AddConvertedCreatureToEncounter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Open5eDataDao openDao = new Open5eDataDao();
        GenericDao<Encounter> encounterDao = DaoFactory.createDao(Encounter.class);
        GenericDao<Creature> creatureDao = DaoFactory.createDao(Creature.class);
        Creature newCreature = new Creature();
        String slugToConvert = req.getParameter("slugToConvert");
        slugToConvert = slugToConvert.replace("}", "");
        Monster monsterToConvert = openDao.getMonster(slugToConvert);
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("selectedEncounter")));
        newCreature = newCreature.convertFromMonster(monsterToConvert, creatureEncounter);

        creatureDao.insert(newCreature);

        /**
        if (req.getParameter("creatureAddToCollection").equals("creatureAddToCollectionTrue")) {
            HttpSession session = req.getSession();
            User currentUser = (User) session.getAttribute("loggedInUser");
            List<Encounter> encounterList = encounterDao.findByPropertyEqual("user", currentUser);
            for (Encounter theEncounter : encounterList) {
                if (theEncounter.getEncounterName().equals("Creature Collection")) {
                    newCreature.setEncounters(theEncounter);
                    creatureDao.insert(newCreature);
                }
            }
        }
         */
        creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("selectedEncounter")));
        req.setAttribute("selectedEncounter", creatureEncounter);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter.jsp");
        dispatcher.forward(req, resp);
    }
}
