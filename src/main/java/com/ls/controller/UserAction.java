package com.ls.controller;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import com.ls.entity.Role;
import com.ls.entity.User;
import com.ls.repository.RoleRepository;
import com.ls.repository.UserRepository;
import com.ls.service.UserService;
import com.ls.util.HanthinkUtil;
import com.ls.vo.ResponseVo;

@Component("userAction")
@Scope("prototype")
public class UserAction extends BaseAction {

	private static final long serialVersionUID = -3519886427026056067L;
	private String username;
	private String name;

	@Autowired
	private RoleRepository roleRepository;

	private List<User> users;

	private Set<String> usersList;

	private User user;

	@Resource(name = "userService")
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	private List<Role> roles;

	public void setUsername(String username) {

		this.username = username;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String ajaxFindUser() {

		String name = getParameter("userName");

		if (StringUtils.isEmpty(name)) {
			users = userRepository.findAll(new Sort(Sort.Direction.ASC, "id"));
		} else {
			users = userService.findUserByName(name);
		}

		for (User user : users) {
			user.setRoles(null);
			user.setPassword("");
		}
		return SUCCESS;
	}

	/**
	 * for auto-complete plugin
	 * 
	 * @return
	 */
	public String getAllUserAccounts() {

		usersList = userService.findAllAccounts();

		return SUCCESS;
	}

	public String loadAllUsers() {

		users = userRepository.findAll(new Sort(Sort.Direction.ASC, "id"));

		return SUCCESS;
	}

	public String createUser() {

		try {
			String userJson = getParameter("userJson");

			if (StringUtils.isEmpty(userJson)) {
				setResponse(HanthinkUtil.makeGeneralErrorResponse(null));
				return SUCCESS;
			}

			User userEntity = HanthinkUtil.getJavaObjectFromJsonString(userJson, User.class);

			// new user
			if (userEntity.getId() == null) {

				User userInDb = userRepository.findByUsername(userEntity.getUsername());

				if (userInDb == null) {

					String password = userEntity.getPassword();
					userEntity.setPassword(HanthinkUtil.getEncodedPassword(password, userEntity.getUsername()));
					userEntity.setActive(true);

				} else {

					setResponse(ResponseVo.newFailMessage(userEntity.getUsername() + "已经存在！"));

					return SUCCESS;
				}

			}

			userRepository.save(userEntity);

		} catch (Exception e) {
			setResponse(HanthinkUtil.makeGeneralErrorResponse(e));
			return SUCCESS;
		}
		setResponse(HanthinkUtil.makeGeneralSuccessResponse());

		return SUCCESS;
	}
	public String disactiveUser() {

		try {
			String userJson = getParameter("userJson");

			if (StringUtils.isEmpty(userJson)) {
				setResponse(HanthinkUtil.makeGeneralErrorResponse(null));
				return SUCCESS;
			}

			User userEntity = HanthinkUtil.getJavaObjectFromJsonString(userJson, User.class);
			
			User refreshUser = userRepository.findOne(userEntity.getId());

			refreshUser.setActive(false);
			refreshUser.setRoles(null);

			userRepository.save(userEntity);
		} catch (Exception e) {
			setResponse(HanthinkUtil.makeGeneralErrorResponse(e));
			return SUCCESS;
		}

		setResponse(HanthinkUtil.makeGeneralSuccessResponse());

		return SUCCESS;
	}

	public String updateUserRole() {

		try {
			String userJson = getParameter("userJson");
			String roleJson = getParameter("roleJson");
			String checkedOrNot = getParameter("checkedOrNot");

			User userFromClient = HanthinkUtil.getJavaObjectFromJsonString(userJson, User.class);
			Role roleFromClient = HanthinkUtil.getJavaObjectFromJsonString(roleJson, Role.class);

			User freshUser = userRepository.findOne(userFromClient.getId());
			Role freshRole = roleRepository.findOne(roleFromClient.getId());

			if (StringUtils.isNotBlank(checkedOrNot) && checkedOrNot.equals("true")) {

				freshUser.getRoles().add(freshRole);
				userRepository.save(freshUser);

			} else {

				freshUser.getRoles().remove(freshRole);
				userRepository.save(freshUser);
			}

		} catch (Exception e) {
			setResponse(HanthinkUtil.makeGeneralErrorResponse(e));
			return SUCCESS;
		}

		setResponse(HanthinkUtil.makeGeneralSuccessResponse());
		return SUCCESS;
	}

	public String resetPassword() {

		try {
			String userJson = getParameter("userJson");
			String newPasswordToReset = getParameter("newPasswordToReset");

			if (StringUtils.isEmpty(userJson)) {
				setResponse(HanthinkUtil.makeGeneralErrorResponse(null));
				return SUCCESS;
			}

			User userEntity = HanthinkUtil.getJavaObjectFromJsonString(userJson, User.class);

			User freshUserInDb = userRepository.findOne(userEntity.getId());

			freshUserInDb.setPassword(HanthinkUtil.getEncodedPassword(newPasswordToReset, freshUserInDb.getUsername()));

			userRepository.save(freshUserInDb);

		} catch (Exception e) {
			setResponse(HanthinkUtil.makeGeneralErrorResponse(e));
			return SUCCESS;
		}

		setResponse(HanthinkUtil.makeGeneralSuccessResponse());

		return SUCCESS;
	}

	public String getAllRoles() {

		roles = roleRepository.findAll();
		for (Role role : roles) {
			role.setUsers(null);
		}
		return SUCCESS;
	}

	public String getUsername() {

		return username;
	}

	public List<User> getUsers() {

		return users;
	}

	public void setUsers(List<User> users) {

		this.users = users;
	}

	public Set<String> getUsersList() {

		return usersList;
	}

	public void setUsersList(Set<String> usersList) {

		this.usersList = usersList;
	}

	public User getUser() {

		return user;
	}

	public void setUser(User user) {

		this.user = user;
	}

	public List<Role> getRoles() {

		return roles;
	}

	public void setRoles(List<Role> roles) {

		this.roles = roles;
	}

}