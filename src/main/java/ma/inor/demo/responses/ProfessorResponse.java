package ma.inor.demo.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorResponse {
	
	private Integer id;
	private String firstName;
	private String lastName;

}
