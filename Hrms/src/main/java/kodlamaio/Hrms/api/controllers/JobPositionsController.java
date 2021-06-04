package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.IJobPositionsService;
import kodlamaio.Hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private IJobPositionsService iJobPositionsService;
	
	@Autowired
	public JobPositionsController(IJobPositionsService iJobPositionsService) {
		super();
		this.iJobPositionsService = iJobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.IJobPositionsService.getAll();
	}
	
}
