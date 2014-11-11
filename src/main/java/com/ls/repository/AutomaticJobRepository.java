package com.ls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ls.entity.AutomaticJob;

public interface AutomaticJobRepository extends JpaRepository<AutomaticJob, Integer>, JpaSpecificationExecutor<AutomaticJob> {

	public static final String FIND_BY_NAME_OR_DB_NAMEQUERY = "select a from AutomaticJob a where a.name like :name or a.dbName like :dbName and a.type='authan'";
	
	List<AutomaticJob> findByType(String type);

	AutomaticJob findByTypeAndDbName(String type, String dbName);
	
	@Query(FIND_BY_NAME_OR_DB_NAMEQUERY)
	List<AutomaticJob> findByNameOrDbName(@Param("name") String name, @Param("dbName") String dbName);
}
