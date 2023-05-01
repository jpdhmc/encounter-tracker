package jdh.controller;

import jdh.entity.Encounter;
import jdh.entity.User;
import jdh.open5edata.Monster;
import jdh.persistence.GenericDao;
import jdh.persistence.Open5eDataDao;
import jdh.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/displayEncounterList"}
)
/**
 * Servlet class that finds the encounters associated with the logged in user and forwards them to the jsp
 *
 * TODO: create servlet and jsp for creating a monster, creating an encounter, importing a monster from api. develop the "creature collection"
 *
 * @author John Den Hartog
 */
public class DisplayEncounterList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Encounter> dao = DaoFactory.createDao(Encounter.class);
        HttpSession session = req.getSession();
        User currentUser = (User) session.getAttribute("loggedInUser");
        req.setAttribute("encounterList", dao.findByPropertyEqual("user_id", currentUser.getId()));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounterList.jsp");
        dispatcher.forward(req, resp);
    }
}
