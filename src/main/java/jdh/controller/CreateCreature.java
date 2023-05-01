package jdh.controller;

import jdh.entity.Creature;
import jdh.open5edata.Monster;
import jdh.persistence.GenericDao;
import jdh.util.DaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateCreature extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Creature> dao;
        dao = DaoFactory.createDao(Creature.class);

        Creature newCreature = new Creature();
        //set attributes using info from form (createCreature.jsp)
        newCreature.setCreatureName(req.getParameter("enteredName"));

        req.setAttribute("creature", newCreature);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewCreature.jsp");
        dispatcher.forward(req, resp);
    }
}
