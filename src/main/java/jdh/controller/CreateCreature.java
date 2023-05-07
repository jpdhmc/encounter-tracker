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
        urlPatterns = {"/createCreature"}
)
public class CreateCreature extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Creature> dao;
        GenericDao<Encounter> encounterDao;
        dao = DaoFactory.createDao(Creature.class);
        encounterDao = DaoFactory.createDao(Encounter.class);

        Creature newCreature = new Creature();
        Encounter creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("creatureEncounter")));

        newCreature.setEncounters(creatureEncounter);

        newCreature.setSize(req.getParameter("creatureSize"));
        newCreature.setType(req.getParameter("creatureType"));
        newCreature.setArmorClass(Integer.parseInt(req.getParameter("creatureArmorClass")));
        newCreature.setMaxHitpoints(Integer.parseInt(req.getParameter("creatureMaxHitPoints")));
        newCreature.setHitDice(req.getParameter("creatureHitdice"));
        newCreature.setSpeed(req.getParameter("creatureSpeed"));

        newCreature.setStrength(Integer.parseInt(req.getParameter("creatureStr")));
        newCreature.setDexterity(Integer.parseInt(req.getParameter("creatureDex")));
        newCreature.setConstitution(Integer.parseInt(req.getParameter("creatureCon")));
        newCreature.setIntelligence(Integer.parseInt(req.getParameter("creatureInt")));
        newCreature.setWisdom(Integer.parseInt(req.getParameter("creatureWis")));
        newCreature.setCharisma(Integer.parseInt(req.getParameter("creatureCha")));

        newCreature.setStrengthSave(Integer.parseInt(req.getParameter("creatureStrSave")));
        newCreature.setDexteritySave(Integer.parseInt(req.getParameter("creatureDexSave")));
        newCreature.setConstitutionSave(Integer.parseInt(req.getParameter("creatureConSave")));
        newCreature.setIntelligenceSave(Integer.parseInt(req.getParameter("creatureIntSave")));
        newCreature.setWisdomSave(Integer.parseInt(req.getParameter("creatureWisSave")));
        newCreature.setCharismaSave(Integer.parseInt(req.getParameter("creatureChaSave")));

        newCreature.setSkillBonuses(req.getParameter("creatureSkills"));
        newCreature.setImmunities(req.getParameter("creatureDamageImmunities"));
        newCreature.setConditionImmunities(req.getParameter("creatureConditionImmunities"));
        newCreature.setResistances(req.getParameter("creatureConditionImmunities"));
        newCreature.setVulnerabilities(req.getParameter("creatureDamageVulnerabilities"));
        newCreature.setSenses(req.getParameter("creatureSenses"));
        newCreature.setLanguages(req.getParameter("creatureLanguages"));
        newCreature.setChallengeRating(req.getParameter("creatureChallengeRating"));
        newCreature.setSpecialAbilities(req.getParameter("creatureSpecialAbilities"));
        newCreature.setActions(req.getParameter("creatureActions"));
        newCreature.setReactions(req.getParameter("creatureReactions"));
        newCreature.setLegendaryActions(req.getParameter("creatureLegendaryActions"));
        newCreature.setTrackingConditions(Boolean.valueOf(req.getParameter("creatureIsTrackingConditions")));
        int id = dao.insert(newCreature);

        req.setAttribute("selectedEncounter", creatureEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter.jsp");
        dispatcher.forward(req, resp);
    }
}
