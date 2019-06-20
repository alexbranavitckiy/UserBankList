package ComponentScan.service;

import ComponentScan.dao.DAO;
import ComponentScan.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AccountServicelmpl implements Services<Account> {

    private DAO<Account> accountDAO;


    @Override
    public int rich(int rich) {
     return    accountDAO.rich(rich);
    }

    @Autowired
    public void setDAO(DAO<Account> accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    @Transactional
    public void edit(Account user) {
        accountDAO.edit(user);
    }


    @Override
    public int Maxsumm(int userid) {
        return accountDAO.Maxsumm(11);
    }

    @Override
    public int getMaxsumm(int userid) {
       return accountDAO.getMaxsumm(userid);
    }

    @Override
    @Transactional
    public void delete(Account account) {
        accountDAO.delete(account);
    }


    @Override
    @Transactional
    public void add(Account user) {
        accountDAO.add(user);
    }

    @Override
    @Transactional
    public Account getById(int id) {
        return accountDAO.getById(id);
    }

    @Override
    @Transactional
    public List<Account> allUsers() {
        return accountDAO.allAccount();
    }

    @Override
    @Transactional
    public int AccountCount() {
        return accountDAO.AccountCount();
    }
}