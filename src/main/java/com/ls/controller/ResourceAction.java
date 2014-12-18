package com.ls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ls.entity.Store;
import com.ls.entity.User;
import com.ls.repository.StoreRepository;

@Component("resourceAction")
@Scope("prototype")
public class ResourceAction extends BaseAction {

	private static final long serialVersionUID = 6603551996408276735L;

	@Autowired
	private StoreRepository storeRepository;

	private List<Store> stores;
	private List<Store> orderedStores;
	private User user;

	public String findAllStores() {

		stores = storeRepository.findAll();

		return SUCCESS;
	}

	public String showOrderedResource() {
		
		
		return SUCCESS;
	}
	
	public List<Store> getStores() {
	
		return stores;
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