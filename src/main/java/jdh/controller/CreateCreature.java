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

        newCreature.setCreatureName(req.getParameter("creatureName"));
        newCreature.setEncounters(creatureEncounter);
        newCreature.setSize(req.getParameter("creatureSize"));
        newCreature.setType(req.getParameter("creatureType"));
        if (req.getParameter("creatureArmorClass") != "") {
            newCreature.setArmorClass(Integer.parseInt(req.getParameter("creatureArmorClass")));
        }
        newCreature.setMaxHitpoints(Integer.parseInt(req.getParameter("creatureMaxHitpoints")));
        newCreature.setHitDice(req.getParameter("creatureHitdice"));
        newCreature.setSpeed(req.getParameter("creatureSpeed"));

        if (req.getParameter("creatureStr") != "") {
            newCreature.setStrength(Integer.parseInt(req.getParameter("creatureStr")));
        }
        if (req.getParameter("creatureDex") != "") {
            newCreature.setDexterity(Integer.parseInt(req.getParameter("creatureDex")));
        }
        if (req.getParameter("creatureCon") != "") {
            newCreature.setConstitution(Integer.parseInt(req.getParameter("creatureCon")));
        }
        if (req.getParameter("creatureInt") != "") {
            newCreature.setIntelligence(Integer.parseInt(req.getParameter("creatureInt")));
        }
        if (req.getParameter("creatureWis") != "") {
            newCreature.setWisdom(Integer.parseInt(req.getParameter("creatureWis")));
        }
        if (req.getParameter("creatureCha") != "") {
            newCreature.setCharisma(Integer.parseInt(req.getParameter("creatureCha")));
        }

        if (req.getParameter("creatureStrSave") != "") {
            newCreature.setStrengthSave(Integer.parseInt(req.getParameter("creatureStrSave")));
        }
        if (req.getParameter("creatureDexSave") != "") {
            newCreature.setDexteritySave(Integer.parseInt(req.getParameter("creatureDexSave")));
        }
        if (req.getParameter("creatureConSave") != "") {
            newCreature.setConstitutionSave(Integer.parseInt(req.getParameter("creatureConSave")));
        }
        if (req.getParameter("creatureIntSave") != "") {
            newCreature.setIntelligenceSave(Integer.parseInt(req.getParameter("creatureIntSave")));
        }
        if (req.getParameter("creatureWisSave") != "") {
            newCreature.setWisdomSave(Integer.parseInt(req.getParameter("creatureWisSave")));
        }
        if (req.getParameter("creatureChaSave") != "") {
            newCreature.setCharismaSave(Integer.parseInt(req.getParameter("creatureChaSave")));
        }

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
        dao.insert(newCreature);

        creatureEncounter = encounterDao.getById(Integer.parseInt(req.getParameter("creatureEncounter")));
        req.setAttribute("selectedEncounter", creatureEncounter);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/displayEncounter.jsp");
        dispatcher.forward(req, resp);
    }
}
