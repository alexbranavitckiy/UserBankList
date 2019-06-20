package ComponentScan.model;

import javax.persistence.*;


@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "accountid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountid;

    @Column(name = "account")
    private int account;

    @Column(name = "userid")
    private int userid;

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserid() {
        return userid;
    }

    public int getAccountid() {
        return accountid;
    }

    public int getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

