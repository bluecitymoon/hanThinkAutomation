package com.ls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ls.entity.AutomaticJob;

public interface AutomaticJobRepository extends JpaRepository<AutomaticJob, Integer>, JpaSpecificationExecutor<AutomaticJob> {

	AutomaticJob findByType(String type);
}
