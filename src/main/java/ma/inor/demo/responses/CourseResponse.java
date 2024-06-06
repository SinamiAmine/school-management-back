package ma.inor.demo.responses;

import java.math.BigDecimal;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.inor.demo.entities.Matiere;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {
	
	private Integer id;
	private String className;
	private LocalTime startTime;
	private LocalTime endTime;
	private BigDecimal price;
	
	@JsonIgnoreProperties({"classRooms"})
	private Matiere matiere;
	
	private ProfessorResponse professor;

}
