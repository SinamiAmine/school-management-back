package ma.inor.demo.services;

import ma.inor.demo.requests.ProfessorRequest;
import ma.inor.demo.responses.ProfessorResponse;

public interface ProfessorService {

	ProfessorResponse create(ProfessorRequest professorRequest);

}
