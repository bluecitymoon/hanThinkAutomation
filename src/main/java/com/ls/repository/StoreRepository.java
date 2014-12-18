package com.ls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> , JpaSpecificationExecutor<Store>{
}
