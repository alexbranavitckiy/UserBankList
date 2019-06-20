package ComponentScan.service;

import ComponentScan.dao.DAO;
import ComponentScan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements Services<User> {

    private DAO<User> userDAO;


    @Override
    public int rich(int rich) {
        return    userDAO.rich(rich);
    }

    @Override
    public int Maxsumm(int userid) {
        return 0;
    }

    @Override
    public int getMaxsumm(int userid) {
        return userDAO.getMaxsumm(userid);
    }

    @Autowired
    public void setDAO(DAO<User>  userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDAO.edit(user);
    }



    @Override
    @Transactional
    public void delete(User user) {
        userDAO.delete(user);
    }


    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return userDAO.getById(id);
    }
    @Override
    @Transactional
    public List<User> allUsers() {
        return userDAO.allAccount();
    }

    @Override
    @Transactional
    public int AccountCount() {
        return userDAO.AccountCount();
    }

   // @Override
    //    @Transactional
    //    public boolean checkName(String title) {
    //        return userDAO.checkName(title);
    //    }
}
