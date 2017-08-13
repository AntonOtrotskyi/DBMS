package com.otr.dbms.db;

import com.otr.dbms.entity.PatientInfoEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.logging.Logger;

public class DAO {
    private SessionFactory sessionFactory;

    public void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
    public void close() {
        sessionFactory.close();
    }
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public void create(PatientInfoEntity patient) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(patient);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            Logger.getLogger("con").info("Exception: " + ex.getMessage());
            ex.printStackTrace(System.err);
            throw new Exception(ex);
        } finally {
            session.close();
        }
    }
    public PatientInfoEntity read(String id){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        PatientInfoEntity patient = null;
        try {
            tx = session.beginTransaction();
            patient = session.get(PatientInfoEntity.class,id);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            Logger.getLogger("con").info("Exception: " + ex.getMessage());
            ex.printStackTrace(System.err);
        } finally {
            session.close();
        }
        return patient;
    }
    public void update(PatientInfoEntity patient){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(patient);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            Logger.getLogger("con").info("Exception: " + ex.getMessage());
            ex.printStackTrace(System.err);
        } finally {
            session.close();
        }
    }
    public void delete(PatientInfoEntity patient){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(patient);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            Logger.getLogger("con").info("Exception: " + ex.getMessage());
            ex.printStackTrace(System.err);
        } finally {
            session.close();
        }
    }

    public static void main(String[] args) {
       PatientInfoEntity patient = new PatientInfoEntity();
       DAO dao = new DAO();
       dao.setup();
       patient.setIdNumber("9");
       patient.setDateTest(java.sql.Date.valueOf("2013-12-14"));
       patient.setClox1Draw(4);
       patient.setRbmtShortDelay(3.1421);
        try {
            dao.create(patient);
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }
        dao.close();
    }
}