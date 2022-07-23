package cl.dojo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comuna")
public class Comuna {

	@Id
	@GeneratedValue
	@Column(name="codigo_comuna")
	private int comunaId;
	@Column(name="nombre")
	private String nombre;
	@Column(name = "codigo_region")
	private int regionId;
	@ManyToOne
	@JoinColumn(name = "codigo_region", updatable = false,insertable = false)
	private Region region;
	
}
