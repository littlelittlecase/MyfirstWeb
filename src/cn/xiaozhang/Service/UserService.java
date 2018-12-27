package cn.xiaozhang.Service;

import cn.xiaozhang.dao.UserDao;
import cn.xiaozhang.domain.User;

public class UserService {

	//service层依赖DAO层
	private UserDao userDao = new UserDao();
	/*
	 * service的查询，需要使用dao来完成
	 * */
	public User find(){
		return userDao.find();
		
		
	}
}
