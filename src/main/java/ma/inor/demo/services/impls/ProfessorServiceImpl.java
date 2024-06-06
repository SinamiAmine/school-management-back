package ma.inor.demo.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.inor.demo.entities.Professor;
import ma.inor.demo.mappers.ProfessorMapper;
import ma.inor.demo.repositories.ProfessorRepository;
import ma.inor.demo.requests.ProfessorRequest;
import ma.inor.demo.responses.ProfessorResponse;
import ma.inor.demo.services.ProfessorService;

@Service
public class ProfessorServiceImpl implements ProfessorService {
	
	@Autowired
	ProfessorMapper professorMapper;
	@Autowired
	ProfessorRepository professoRepository;

	@Override
	public ProfessorResponse create(ProfessorRequest professorRequest) {
		Professor professor = professorMapper.map(professorRequest);
		ProfessorResponse professorResponse = professorMapper.map(professoRepository.save(professor));
		return professorResponse;
	}

}
