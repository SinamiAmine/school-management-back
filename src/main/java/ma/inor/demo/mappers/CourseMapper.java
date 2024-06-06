package ma.inor.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ma.inor.demo.entities.Course;
import ma.inor.demo.requests.CourseRequest;
import ma.inor.demo.responses.CourseResponse;

@Mapper(componentModel = "spring")
public interface CourseMapper {
	
	CourseMapper INSTANCE =  Mappers.getMapper(CourseMapper.class);
	
	Course map(CourseRequest classRequest);
	CourseResponse map(Course classRoom);

}
