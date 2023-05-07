package jdh.controller;

import jdh.entity.Encounter;
import jdh.entity.User;
import jdh.persistence.GenericDao;
import jdh.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/displayEncounter"}
)
/**
 * Servlet class to create a new encounter
 */
public class createEncounter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Encounter> encounterDao = DaoFactory.createDao(Encounter.class);
        HttpSession session = req.getSession();
        User currentUser = (User) session.getAttribute("loggedInUser");

        Encounter newEncounter = new Encounter();

        newEncounter.setEncounterName(req.getParameter("encounterName"));
        newEncounter.setUser(currentUser);

        int id = encounterDao.insert(newEncounter);

        req.setAttribute("selectedEncounter", id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter");
        dispatcher.forward(req, resp);
    }
}
