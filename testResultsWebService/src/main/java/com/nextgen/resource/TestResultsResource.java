package com.nextgen.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextgen.model.Nges_his_test_findings_chemlab;
import com.nextgen.repository.TestResultRepo;

@RestController
@RequestMapping(value="rest/results")
public class TestResultsResource {

	@Autowired
	TestResultRepo testResultRepo;
	
	@GetMapping(value="/all")
	public List<Nges_his_test_findings_chemlab>  getAll(){
		return testResultRepo.findAll();
	}
	
	@PostMapping(value="/persist")
	public List<Integer> persist(@RequestBody List<Nges_his_test_findings_chemlab> testResultList) {
		
		ArrayList<Integer> listOfSavedTestResultBatchNumber=new ArrayList<>();
		
		for(Nges_his_test_findings_chemlab nhtfc:testResultList) {
			Nges_his_test_findings_chemlab savedTestResult=testResultRepo.save(nhtfc);
			listOfSavedTestResultBatchNumber.add(savedTestResult.getBatch_nr());
			
		}
		return listOfSavedTestResultBatchNumber;
		}
}
