package org.qcy.service;

import org.qcy.dao.UserDao;
import org.qcy.entity.User;

// ҵ���߼��㣺�߼��Ե���ɾ�Ĳ飨������+��������dao�������װ
public class UserService {
//		UserDao userDao;
		// �� 
		public boolean queryUser(User user) {
				return UserDao.queryUser(user.getName(),user.getPsw());
		}
		
		// �� ����+����
		
		
}
