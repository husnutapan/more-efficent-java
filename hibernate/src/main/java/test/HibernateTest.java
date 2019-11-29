package test;

import configuration.HibernateUtil;
import model.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateTest {
    public static void main(String[] args) {
        Transaction transaction = null;

     /*   Person person = new Person();
        person.setFirstName("Husnu");
        person.setLastName("Tapan");*/

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Person person = session.load(Person.class, 1);
            session.evict(person);
//            session.clear();
            person = session.load(Person.class, 1);
//            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            assert transaction != null;
            transaction.rollback();
        }


    }
}
