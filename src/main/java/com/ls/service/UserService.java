package com.ls.service;

import java.util.List;
import java.util.Set;

import com.ls.entity.User;
import com.ls.vo.ResponseVo;

public interface UserService {
	List<User> findUserByName(String name);
	Set<String> findAllAccounts();
	
	User findUser(String username, String password);
	
	User getCurrentLoggedInUser();
	
	ResponseVo updateUserStore(List<Integer> storeIds, Integer userId);
}
