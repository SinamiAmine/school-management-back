package ma.inor.demo.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.inor.demo.entities.Course;
import ma.inor.demo.entities.Matiere;
import ma.inor.demo.entities.Professor;
import ma.inor.demo.mappers.CourseMapper;
import ma.inor.demo.repositories.CourseRepository;
import ma.inor.demo.repositories.MatiereRepository;
import ma.inor.demo.repositories.ProfessorRepository;
import ma.inor.demo.requests.CourseRequest;
import ma.inor.demo.responses.CourseResponse;
import ma.inor.demo.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseMapper courseMapper;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	MatiereRepository matiereRepository;
	@Autowired
	ProfessorRepository professorRepository;

	@Override
	public CourseResponse create(CourseRequest classRequest) {
		Course course = courseMapper.map(classRequest);
		Matiere matiere = matiereRepository.findById(classRequest.getMatiereId()).orElse(null);
		Professor professor = professorRepository.findById(classRequest.getProfessorId()).orElse(null);
		course.setMatiere(matiere);
		course.setProfessor(professor);
		CourseResponse classResponse = courseMapper.map(courseRepository.save(course));
		return classResponse;
	}

}
