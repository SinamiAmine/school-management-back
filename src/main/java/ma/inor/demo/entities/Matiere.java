package ma.inor.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="matiere")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Matiere extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String code;
	
	private String label;
	
	@ManyToOne
	@JoinColumn(name = "type_matiere_id")
	private TypeMatiere typeMatiere;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matiere")
	private List<Course> courses;

}
