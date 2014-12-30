package com.ls.jobs;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.ImmutableList;
import com.ls.entity.Menu;
import com.ls.entity.Role;
import com.ls.entity.Store;
import com.ls.entity.User;
import com.ls.repository.MenuRepository;
import com.ls.repository.RoleRepository;
import com.ls.repository.StoreRepository;
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

	@Autowired
	private MenuRepository menuRepository;

	@Autowired
	private StoreRepository storeRepository;

	@Test
	public void testCreateStores() {

		Store store = new Store("欧尚", "AUTHAN");
		Store store1 = new Store("麦德龙", "METRO");
		Store store2 = new Store("宝钢", "BAOGANG");
		Store store3 = new Store("图搜天下", "SOSO");

		storeRepository.save(ImmutableList.of(store, store1, store2, store3));

	}

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

	@Test
	public void testInitialMenus() {

		Menu menu1 = new Menu("任务管理", "/ls/user/load.action", "jobCenter");
		Menu menu2 = new Menu("用户管理", "/ls/admin/loadUser.action", "userManager");
		// Menu menu3 = new Menu("系统配置", "/ls/admin/configuration.action", "systemConfiguration");
		Menu menu4 = new Menu("数据中心", "/ls/admin/loadDataCenter.action", "dataCenter");
		Menu menu6 = new Menu("资源分配", "/ls/admin/userResourceAssign.action", "resourceAssign");

		menuRepository.save(ImmutableList.of(menu1, menu2, menu6, menu4));

	}
	
	@Test
	public void testPurETet() {
		System.out.println(Integer.valueOf("03"));
	}
}
