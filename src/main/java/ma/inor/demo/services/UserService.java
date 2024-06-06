package ma.inor.demo.services;

import ma.inor.demo.requests.UserRequest;
import ma.inor.demo.responses.UserResponse;

public interface UserService {

	UserResponse create(UserRequest userRequest);


}
