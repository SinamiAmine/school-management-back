package ma.inor.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ma.inor.demo.entities.Professor;
import ma.inor.demo.requests.ProfessorRequest;
import ma.inor.demo.responses.ProfessorResponse;

@Mapper(componentModel = "spring")
public interface ProfessorMapper {
	
	ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);
	
	Professor map(ProfessorRequest professorRequest);
	ProfessorResponse map(Professor professor);

}
