package com.demo.demoSSH.dao;

import com.demo.demoSSH.dao.impl.BaseDao;
import com.demo.demoSSH.model.User;

/**
 * Created by carlkong on 2016/8/25.
 */
public interface IUserDao extends IBaseDao<User,String> {
    User demoNewDaoMethod(String id);
}
