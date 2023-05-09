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
        urlPatterns = {"/deleteEncounter"}
)
public class DeleteEncounter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Encounter> encounterDao = DaoFactory.createDao(Encounter.class);
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("deletingEncounter")));
        encounterDao.delete(creatureEncounter);

        req.setAttribute("selectedEncounter", creatureEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter");
        dispatcher.forward(req, resp);
    }
}
