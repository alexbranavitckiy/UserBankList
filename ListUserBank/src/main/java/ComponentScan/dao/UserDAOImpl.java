package ComponentScan.dao;

import ComponentScan.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public class UserDAOImpl implements DAO<User> {
    private SessionFactory sessionFactory;

    @Override
    public int rich(int rich) {
        return 0;
    }

    @Override
    public int Maxsumm(int userid) {
        return 0;
    }

    @Override
    public int getMaxsumm(int userid) {
        Session session = sessionFactory.getCurrentSession();
        String sql= " SELECT userid, sum(account) from Account ";
        return session.createQuery(sql, Number.class).getSingleResult().intValue();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public int AccountCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from User", Number.class).getSingleResult().intValue();
    }

    @Override
    public List<User> allAccount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").list();
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);

    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

   // @Override
    //    public boolean checkName(String name) {
    //        Session session = sessionFactory.getCurrentSession();
    //        Query query;
    //        query = session.createQuery("from User where name = :title");
    //        query.setParameter("title", name);
    //        return query.list().isEmpty();
    //    }
}
