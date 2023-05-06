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
 * Servlet class to examine a single encounter in detail
 */
public class displayEncounter extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Encounter> dao = DaoFactory.createDao(Encounter.class);
        HttpSession session = req.getSession();
        int selectedEncounterId = Integer.parseInt(req.getParameter("selectedEncounter"));
        Encounter selectedEncounter = dao.getById(selectedEncounterId);
        req.setAttribute("selectedEncounter", selectedEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter.jsp");
        dispatcher.forward(req, resp);
    }
}
