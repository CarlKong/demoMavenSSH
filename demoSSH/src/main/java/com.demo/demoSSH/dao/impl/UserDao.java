package com.demo.demoSSH.dao.impl;

import com.demo.demoSSH.dao.IUserDao;
import com.demo.demoSSH.model.User;
import com.demo.demoSSH.util.PageResults;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;
import java.util.List;

/**
 * Created by carlkong on 2016/8/25.
 */
public class UserDao extends BaseDao<User,String> implements IUserDao {

    @Override
    public User demoNewDaoMethod(String id) {
        return null;
    }
}
