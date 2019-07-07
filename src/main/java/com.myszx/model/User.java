package com.myszx.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "first_name")
    @NotNull
    private String name;

    @Column(name = "last_surname")
    @NotNull
    private String surname;

    @Column(name = "balance")
    @NotNull
    private BigDecimal balance;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "password")
    @NotNull
    private String password;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(long accountNumber, String name, String surname, String login, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        balance = BigDecimal.ZERO;
    }

}
