package cn.heyw.service;

import cn.heyw.domain.TUser;

public interface UserService {
     void addUser(TUser user);
     TUser getUserById(String id);
     
}
