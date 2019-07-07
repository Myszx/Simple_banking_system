package com.myszx.dao;

import com.myszx.model.User;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user){
        entityManager.persist(user);
    }



}
