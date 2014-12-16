package com.ls.jobs;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.ImmutableList;
import com.ls.entity.Role;
import com.ls.entity.User;
import com.ls.repository.RoleRepository;
import com.ls.repository.UserRepository;

/**
 * This class is for basic data preparation for the web app starting up. using this class without retrieving data from the UI. The data must not be
 * changed.
 * 
 * @author jjiang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestInitializationScripts {

	
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testCreateUserAndRoles() {
		
		User adminUser = new User("Hanthink Administrator", "hanthink", getEncodedPassword("hanthink", "hanthink"), true);
		
		User auchanUser = new User("auchan001", "auchan001", getEncodedPassword("auchan001", "auchan001"), true);
		
		Role superAdmin = new Role("ROLE_ADMIN", "系统管理者");
		
		Role normalUser = new Role("ROLE_CUSTOMER", "用户");
		
		
		adminUser.setRoles(ImmutableList.of(superAdmin));
		
		auchanUser.setRoles(ImmutableList.of(normalUser));
		
		
		List<Role> roles = ImmutableList.of(superAdmin, normalUser);
		
		List<User> users = ImmutableList.of(adminUser, auchanUser);
		
		roleRepository.save(roles);
		
		userRepository.save(users);
		
	}
	
	private String getEncodedPassword(String password, String username) {
		ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder(256);
		return shaPasswordEncoder.encodePassword(password, username);
	}
	
	

	@Test
	public void testActiveUsers() {
		
		List<User> users = userRepository.findAll();
		for (User user : users) {
			user.setActive(true);
		}
		
		userRepository.save(users);
	}
}
