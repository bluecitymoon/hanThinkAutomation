package com.ls.controller;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.ls.entity.Store;
import com.ls.entity.User;
import com.ls.repository.StoreRepository;
import com.ls.repository.UserRepository;
import com.ls.service.UserService;
import com.ls.vo.ResponseVo;

@Component("resourceAction")
@Scope("prototype")
public class ResourceAction extends BaseAction {

	private static final long serialVersionUID = 6603551996408276735L;

	@Autowired
	private StoreRepository storeRepository;

	@Autowired
	private UserRepository userRepository;

	@Resource(name = "userService")
	private UserService userService;

	private List<Store> stores;
	private List<String> orderedStores;
	private List<Store> orderedDetailedStores;

	public String findAllStores() {

		stores = storeRepository.findAll();
		for (Store store : stores) {
			store.setUsers(null);
		}

		return SUCCESS;
	}

	public String findAssignedStores() {

		User currentUser = null;

		String userId = getParameter("userId");
		if (StringUtils.isEmpty(userId)) {
			currentUser = userService.getCurrentLoggedInUser();
		} else {
			currentUser = userRepository.findOne(Integer.valueOf(userId));
		}

		List<Integer> assignedStores = storeRepository.findOrderedStoreIdsByUserId(currentUser.getId());

		orderedStores = Lists.newArrayList();

		for (Integer store : assignedStores) {
			orderedStores.add(store.toString());
		}

		return SUCCESS;
	}

	public String findAssignedDetailedStores() {

		User currentUser = userService.getCurrentLoggedInUser();

		orderedDetailedStores = storeRepository.findByUsers(ImmutableList.of(currentUser));

		for (Store singleStore : orderedDetailedStores) {
			singleStore.setUsers(null);
		}

		return SUCCESS;
	}

	public String updateUserStore() {

		String selectedStoresJson = getParameter("selectedStores");
		String userIdJson = getParameter("userId");

		if (StringUtils.isBlank(userIdJson)) {
			setResponse(ResponseVo.newFailMessage("用户信息缺失"));
		}

		Object[] cityArray = JSONArray.fromObject(selectedStoresJson).toArray();

		List<Integer> storeIds = Lists.newArrayList();
		for (Object cityIdString : cityArray) {
			storeIds.add(Integer.valueOf(cityIdString.toString()));
		}

		ResponseVo response = userService.updateUserStore(storeIds, Integer.valueOf(userIdJson));
		setResponse(response);

		return SUCCESS;
	}

	public List<Store> getOrderedDetailedStores() {

		return orderedDetailedStores;
	}

	public void setOrderedDetailedStores(List<Store> orderedDetailedStores) {

		this.orderedDetailedStores = orderedDetailedStores;
	}

	public List<Store> getStores() {

		return stores;
	}

	public List<String> getOrderedStores() {

		return orderedStores;
	}

	public void setOrderedStores(List<String> orderedStores) {

		this.orderedStores = orderedStores;
	}

	public void setStores(List<Store> stores) {

		this.stores = stores;
	}

	public StoreRepository getStoreRepository() {

		return storeRepository;
	}

	public void setStoreRepository(StoreRepository storeRepository) {

		this.storeRepository = storeRepository;
	}
}