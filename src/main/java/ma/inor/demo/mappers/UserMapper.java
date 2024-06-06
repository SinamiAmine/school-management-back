package ma.inor.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ma.inor.demo.entities.User;
import ma.inor.demo.requests.UserRequest;
import ma.inor.demo.responses.UserResponse;

@Mapper(componentModel = "spring")
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	User map(UserRequest userRequest);
	UserResponse map(User user);

}
