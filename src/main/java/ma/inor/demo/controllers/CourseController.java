package ma.inor.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.inor.demo.requests.CourseRequest;
import ma.inor.demo.responses.CourseResponse;
import ma.inor.demo.services.CourseService;

@RestController
@RequestMapping("api/v1/classes")
public class CourseController {
	
	@Autowired
	CourseService classService;
	
	@PostMapping("/create")
	public ResponseEntity<CourseResponse> create(@RequestBody CourseRequest classRequest){
		return new ResponseEntity<CourseResponse>(classService.create(classRequest), HttpStatus.CREATED);
	}

}
