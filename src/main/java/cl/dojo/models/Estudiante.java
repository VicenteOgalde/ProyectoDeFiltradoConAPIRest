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
@Table(name="estudiante")
public class Estudiante {

	@Id
	@GeneratedValue
	@Column(name = "id_estudiante")
	private int estudianteId;
	@Column(name = "nombre")
	private String nombre;
	@Column(name="rut")
	private String rut;
	@Column(name="apellido_pat")
	private String apellidoPaterno;
	@Column(name="apellido_mat")
	private String apellidoMaterno;
	@Column(name="direccion")
	private String direccion;
	@Column(name="codigo_curso")
	private String cursoId;
	@Column(name="codigo_comuna")
	private int comunaId;
	@ManyToOne
	@JoinColumn(name = "codigo_comuna",updatable = false, insertable = false)
	private Comuna comuna;
	@ManyToOne
	@JoinColumn(name = "codigo_curso",updatable = false, insertable = false)
	private Curso curso;
}
