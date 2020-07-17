package test;


import entity.Pais;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateConfig;

public class main {
    public static void main(String[] args) {
        Pais pais = new Pais("Argentina");
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(pais);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
