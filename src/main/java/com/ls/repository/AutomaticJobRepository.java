package com.ls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.AutomaticJob;

public interface AutomaticJobRepository extends JpaRepository<AutomaticJob, Integer>, JpaSpecificationExecutor<AutomaticJob> {

	List<AutomaticJob> findByType(String type);

	AutomaticJob findByTypeAndDbName(String type, String dbName);
}
