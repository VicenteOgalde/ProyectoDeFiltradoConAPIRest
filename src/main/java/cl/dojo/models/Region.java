package cl.dojo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "region")
public class Region {

	@Id
	@GeneratedValue
	@Column(name = "codigo_region")
	private int regionId;
	@Column(name = "nombre")
	private String nombre;
	
	
}
