package ma.inor.demo.services;

import ma.inor.demo.requests.CourseRequest;
import ma.inor.demo.responses.CourseResponse;

public interface CourseService {

	CourseResponse create(CourseRequest classRequest);

}
