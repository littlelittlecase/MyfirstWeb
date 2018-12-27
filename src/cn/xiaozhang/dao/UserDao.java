package cn.xiaozhang.dao;

import cn.xiaozhang.domain.User;
/*把xml中的数据查询出来之后，封装到user对象中，然后返回*/
public class UserDao {
	public User find(){
		return new User("zhangsan","username");
	}

}
