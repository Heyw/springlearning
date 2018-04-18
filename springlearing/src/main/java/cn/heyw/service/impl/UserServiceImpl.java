package cn.heyw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.heyw.domain.TUser;
import cn.heyw.service.UserService;
/**
 * 使用注解Service，将UserServiceImpl标记为一个service
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	/**
	 *使用@Autowired注解，将userMapper标注为TUserMapper的变量
	 *当需要使用的时候，由spring自动注入
	 */
     @Autowired
	private cn.heyw.data.TUserMapper userMapper;//注入daoO
	@Override
	public void addUser(TUser user) {
         userMapper.insert(user);
	}

	@Override
	public TUser getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
