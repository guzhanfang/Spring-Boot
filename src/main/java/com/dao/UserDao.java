package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public interface UserDao {
	ArrayList<UserBean> query();
}
