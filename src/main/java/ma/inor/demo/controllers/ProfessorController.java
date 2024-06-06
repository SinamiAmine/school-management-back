package ma.inor.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.inor.demo.requests.ProfessorRequest;
import ma.inor.demo.responses.ProfessorResponse;
import ma.inor.demo.services.ProfessorService;

@RestController
@RequestMapping("api/v1/professors")
public class ProfessorController {
	
	@Autowired
	ProfessorService professorService;
	
	@PostMapping("/create")
	public ResponseEntity<ProfessorResponse> create(@RequestBody ProfessorRequest professorRequest){
		return new ResponseEntity<ProfessorResponse>(professorService.create(professorRequest), HttpStatus.CREATED);
	}

}
