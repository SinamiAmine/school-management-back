package ma.inor.demo.requests;

import java.math.BigDecimal;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {
	
	private String className;
	private LocalTime startTime;
	private LocalTime endTime;
	private BigDecimal price;
	
	private Integer matiereId;
	private Integer professorId;

}
