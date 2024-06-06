package ma.inor.demo.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code;
	private String label;
	private LocalTime startTime;
	private LocalTime endTime;
	private BigDecimal price;
	private BigDecimal percent;
	
	@ManyToOne
	@JoinColumn(name = "matiere_id")
	private Matiere matiere;
	
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	
	@ManyToMany
	@JoinTable(
		name = "student_courses",
		joinColumns = @JoinColumn(name = "course_id"),
		inverseJoinColumns = @JoinColumn(name = "student_id")
			)
	private Set<Student> students;

}
