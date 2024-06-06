package ma.inor.demo.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime crated_at;
	
	@UpdateTimestamp
	private LocalDateTime updated_at;

}
