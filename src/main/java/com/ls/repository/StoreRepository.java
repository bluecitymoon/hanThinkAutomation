package com.ls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ls.entity.Store;
import com.ls.entity.User;

public interface StoreRepository extends JpaRepository<Store, Integer> , JpaSpecificationExecutor<Store>{
	List<Store> findByUsers(List<User> users);
	
	@Query(value="select store_id from ls_user_store where user_id = :userId", nativeQuery=true)
	List<Integer> findOrderedStoreIdsByUserId(@Param("userId") Integer userId);
	
	@Query(value="select s.id from ls_store s, ls_user_store t where s.id = t.store_id and t.user_id = :userId", nativeQuery=true)
	List<Integer> findByUserid(@Param("userId") Integer userId);
}
