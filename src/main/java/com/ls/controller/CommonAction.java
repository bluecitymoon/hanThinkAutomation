package com.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ls.entity.Menu;
import com.ls.entity.User;
import com.ls.repository.MenuRepository;
import com.ls.repository.UserRepository;

@Component("commonAction")
@Scope("prototype")
public class CommonAction extends BaseAction {

	private static final long serialVersionUID = 7274858323873739463L;

	@Autowired
	private MenuRepository menuRepository;

	@Autowired
	private UserRepository userRepository;

	private List<Menu> menus;
	private User user;

	public String findAllMenus() {

		menus = menuRepository.findAll();

		return SUCCESS;
	}

	public List<Menu> getMenus() {

		return menus;
	}

	public User getUser() {

		return user;
	}

	public void setUser(User user) {

		this.user = user;
	}

	public void setMenus(List<Menu> menus) {

		this.menus = menus;
	}

}