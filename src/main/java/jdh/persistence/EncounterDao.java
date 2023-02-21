package jdh.persistence;

import jdh.entity.Encounter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class EncounterDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all encounters
     *
     * @return all encounters
     */
    public List<Encounter> getAllEncounters() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Encounter> query = builder.createQuery(Encounter.class);
        Root<Encounter> root = query.from(Encounter.class);
        List<Encounter> encounters = session.createQuery(query).getResultList();
        session.close();
        logger.info("GET ALL ENCOUNTERS: ");
        for (Encounter listEncounter : encounters) {
            logger.info(listEncounter.toString());
        }
        return encounters;
    }

    /**
     * Gets an encounter by property with a value similar to entered value
     *
     * @param propertyName the property name
     * @param value        the value
     * @return encounters
     */
    public List<Encounter> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.info("GET ENCOUNTER BY " + propertyName + " like " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Encounter> query = builder.createQuery(Encounter.class);
        Root<Encounter> root = query.from(Encounter.class);
        Expression<String> propertyPath = root.get(propertyName);
        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Encounter> encounters = session.createQuery(query).getResultList();
        session.close();
        return encounters;
    }

    /**
     * Gets encounter by id.
     *
     * @param id the id
     * @return the id
     */
    public Encounter getById(int id) {
        Session session = sessionFactory.openSession();
        Encounter encounter = session.get(Encounter.class, id);
        session.close();
        logger.info("GET ENCOUNTER BY ID: " + encounter);
        return encounter;
    }

    /**
     * Insert an encounter
     *
     * @param encounter the encounter
     * @return the id of the inserted encounter
     */
    public int insert(Encounter encounter) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(encounter);
        transaction.commit();
        session.close();
        logger.info("INSERTED ENCOUNTER: " + encounter);
        return id;
    }

    /**
     * Save or update an encounter
     *
     * @param encounter the encounter
     */
    public void saveOrUpdate(Encounter encounter) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(encounter);
        transaction.commit();
        session.close();
        logger.info("UPDATED ENCOUNTER NAME: " + encounter.getEncounterName());
    }

    /**
     * Delete an encounter
     *
     * @param encounter the encounter
     */
    public void delete(Encounter encounter) {
        logger.info("DELETING ENCOUNTER: " + encounter);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(encounter);
        transaction.commit();
        session.close();
    }
}
