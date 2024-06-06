package ma.inor.demo.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.inor.demo.mappers.UserMapper;
import ma.inor.demo.repositories.UserRepository;
import ma.inor.demo.requests.UserRequest;
import ma.inor.demo.responses.UserResponse;
import ma.inor.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserMapper userMapper;

	@Override
	public UserResponse create(UserRequest userRequest) {
		return userMapper.map(userRepository.save(userMapper.map(userRequest)));
	}

}
