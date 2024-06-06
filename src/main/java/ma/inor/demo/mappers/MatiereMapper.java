package ma.inor.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ma.inor.demo.entities.Matiere;
import ma.inor.demo.requests.MatiereRequest;
import ma.inor.demo.responses.MatiereResponse;

@Mapper(componentModel = "spring")
public interface MatiereMapper {
	
	MatiereMapper INSTANCE = Mappers.getMapper(MatiereMapper.class);
	
	Matiere map(MatiereRequest matiereRequest);
	MatiereResponse map(Matiere matiere);

}
