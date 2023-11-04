import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String str[]) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println(session);

        Shop sh1 = new Shop();
        ContactShop cs = new ContactShop();
        Category category = new Category();
        Characteristica characteristica = new Characteristica();
        Gallery g = new Gallery();
        Producer producer = new Producer();
        Product product = new Product();
        session.save(sh1);
        session.save(cs);
        session.save(category);
        session.save(characteristica);
        session.save(g);
        session.save(producer);
        session.save(product);

        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
