package ma.inor.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="property")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Property extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adress_id", referencedColumnName = "id")
	private Address address; 
	
	@OneToOne
	@JoinColumn(name = "image_id", referencedColumnName = "id")
	private Image image;
	
	private String propertyName;
	
	private String email;
	
	private String ice;
	
	private String fax;
	
	private String gsm;
	
	private String raisonSocial;
	
	private String patente;
	
	

}
