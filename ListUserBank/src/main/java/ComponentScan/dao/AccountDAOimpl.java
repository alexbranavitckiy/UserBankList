package ComponentScan.dao;

import ComponentScan.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class AccountDAOimpl implements DAO<Account> {

    private SessionFactory sessionFactory;


    @Override
    public int rich(int rich) {
        Session session = sessionFactory.getCurrentSession();
     //   String sql = "SELECT name,SUM(account)  FROM user JOIN account q ON userid = q.userid GROUP BY name order by account desc ";
//System.out.println( session.createQuery(sql, Number.class).getSingleResult().intValue());
        return   2;
    }

    //String SQL = ".."; //Запрос, который Вас интересует
//Query query = getEntityManager().createNativeQuery(SQL); //Не требует маппинга
//query.setParameter("какой-то параметр", 123);
    @Override
    public int Maxsumm(int userid) {
        Session session = sessionFactory.getCurrentSession();
        String sql = "SELECT  SUM(account) FROM Account";

        return    session.createQuery(sql, Number.class).getSingleResult().intValue();

    }
//SELECT name,SUM(account)  FROM user JOIN account q ON user.userid = q.userid GROUP BY name order by account desc Limit 1
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Account getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Account.class, id);
    }

    @Override
    public List<Account> allAccount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Account").list();
    }

    @Override
    public int AccountCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from Account", Number.class).getSingleResult().intValue();
    }


    @Override
    public int getMaxsumm(int userid) {
        Session session = sessionFactory.getCurrentSession();
        String sql= "SELECT  SUM(account) FROM account";
        return session.createQuery(sql, Number.class).getSingleResult().intValue();
    }

    @Override
    public void add(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(account);
    }

    @Override
    public void delete(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(account);
    }

    @Override
    public void edit(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.update(account);
    }

}
