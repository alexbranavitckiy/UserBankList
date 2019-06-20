package ComponentScan.service;


import java.util.List;

public interface Services<T> {

    int Maxsumm(int userid);
    int rich(int rich);
    int getMaxsumm(int userid);
    List<T> allUsers();
    void add( T account);
    void delete( T account);
    void edit( T account);
    T getById(int id);
    int AccountCount();
}
