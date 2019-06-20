package ComponentScan.dao;

import java.util.List;

public interface DAO<T>{


    List<T> allAccount();

    int getMaxsumm(int userid);
    int Maxsumm(int userid);

    int rich(int rich);



    void add(T account);

    void delete(T account);

    void edit(T account);

    T getById(int id);

    int AccountCount();

}
