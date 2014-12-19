package com.ls.service.impl;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.ls.entity.Store;
import com.ls.entity.User;
import com.ls.repository.StoreRepository;
import com.ls.repository.UserRepository;
import com.ls.service.UserService;
import com.ls.util.HanthinkUtil;
import com.ls.vo.ResponseVo;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StoreRepository storeRepository;

	public List<User> findUserByName(String name) {
		return userRepository.findByName(name);
	}

	public Set<String> findAllAccounts() {
		List<User> users = userRepository.findAll();
		Set<String> userAccounts = new TreeSet<String>();
		for (User user : users) {
			userAccounts.add(user.getName());
		}
		return userAccounts;
	}

	public User findUser(final String username, final String password) {
		List<User> users = userRepository.findByUsernameAndPassword(username, password);
		
		if (users.isEmpty()) {
			return null;
		}
		
		if (users.size() != 1) {
			
		}
//		Specification<User> specification = new Specification<User>() {
//
//			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//				Predicate predicate = new ExistsPredicate(cb, null);
//				return null;
//			}
//		};
	//	userRepository.findOne(spec)
		return users.get(0);
	}
	
	public User getCurrentLoggedInUser() {

		String username = HanthinkUtil.getCurrentUserName();
		
		return userRepository.findByUsername(username);
		
	}

	@Secured({"ROLE_ADMIN"})
	public ResponseVo updateUserStore(List<Integer> storeIds, Integer userId) {
		
		try {
			List<Store> newStores = Lists.newArrayList();
			User targetUser = userRepository.findOne(userId);
			
			if (null == storeIds || storeIds.size() == 0) {
				targetUser.setStores(null);
			} else {
				for (Integer storeId : storeIds) {
					
					Store singleStore = storeRepository.findOne(storeId);
					newStores.add(singleStore);
				}
				
				targetUser.setStores(newStores);
			}
			
			userRepository.save(targetUser);
		} catch (Exception e) {
			return HanthinkUtil.makeGeneralErrorResponse(e);
		}
		
		return HanthinkUtil.makeGeneralSuccessResponse();
	}
	
	
}
