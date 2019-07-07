package com.myszx.service;

import com.myszx.dao.TransactionDao;
import com.myszx.dao.UserDao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@RequestScoped
@Transactional
public class UserService {

    @Inject
    private UserDao userDao;

    @Inject
    private TransactionDao transactionDao;

}
