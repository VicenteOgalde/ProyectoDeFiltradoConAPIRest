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
@Table(name="tutor")
public class Tutor {

	@Id
	@GeneratedValue
	@Column(name = "codigo_tutor")
	private int tutorId;
	@Column(name = "rut")
	private String rut;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido_pat")
	private String apellidoPat;
	@Column(name = "apellido_mat")
	private String apellidoMat;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "cargo")
	private String cargo;
	@Column(name = "codigo_comuna")
	private int comunaId;
	@ManyToOne
	@JoinColumn(name = "codigo_comuna", insertable = false,updatable = false)
	private Comuna comuna;
	
	
}
