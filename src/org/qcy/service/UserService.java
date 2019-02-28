package org.qcy.service;

import org.qcy.dao.UserDao;
import org.qcy.entity.User;

// 业务逻辑层：逻辑性的增删改查（增：查+增），对dao层进行组装
public class UserService {
//		UserDao userDao;
		// 查 
		public boolean queryUser(User user) {
				return UserDao.queryUser(user.getName(),user.getPsw());
		}
		
		// 增 （查+增）
		
		
}
