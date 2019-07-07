package com.myszx.dao;

import com.myszx.model.Transaction;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class TransactionDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Transaction transaction){
        entityManager.persist(transaction);
    }
}
