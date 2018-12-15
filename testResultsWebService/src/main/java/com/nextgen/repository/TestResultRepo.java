package com.nextgen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nextgen.model.Nges_his_test_findings_chemlab;

public interface TestResultRepo  extends JpaRepository<Nges_his_test_findings_chemlab, Integer> {

}
