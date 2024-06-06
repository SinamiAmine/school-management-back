package ma.inor.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.inor.demo.requests.UserRequest;
import ma.inor.demo.responses.UserResponse;
import ma.inor.demo.services.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@PostMapping("/create")
	public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest) {
		return new ResponseEntity<UserResponse>(userService.create(userRequest), HttpStatus.CREATED);
	}

}
