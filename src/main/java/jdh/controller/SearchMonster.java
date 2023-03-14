package jdh.controller;

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
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/searchMonster"}
)
public class SearchMonster extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Open5eDataDao dao = new Open5eDataDao();
        String enteredMonster = req.getParameter("monsterName");
        Monster foundMonster = dao.getMonster(enteredMonster);
        req.setAttribute("monster", foundMonster);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/monsterResults.jsp");
        dispatcher.forward(req, resp);
    }
}
