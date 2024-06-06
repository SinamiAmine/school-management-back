package ma.inor.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.inor.demo.requests.MatiereRequest;
import ma.inor.demo.responses.MatiereResponse;
import ma.inor.demo.services.MatiereService;

@RestController
@RequestMapping("api/v1/matiere")
public class MatiereController {
	
	@Autowired
	MatiereService matiereService;
	
	@PostMapping("/create")
	public ResponseEntity<MatiereResponse> create(@RequestBody MatiereRequest matiereRequest){
		return new ResponseEntity<MatiereResponse>(matiereService.create(matiereRequest), HttpStatus.CREATED);
	}

}
