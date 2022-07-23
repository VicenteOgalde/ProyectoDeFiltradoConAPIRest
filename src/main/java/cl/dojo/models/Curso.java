package cl.dojo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "codigo_curso")
	private String cursoId;
	@Column(name = "codigo_comuna")
	private int comunaId;
	@Column(name = "codigo_plan_formativo")
	private String planFormativoId;
	@Column(name = "fecha_inicio")
	@DateTimeFormat(pattern ="yyyy/MM/dd")
	private Date fechaInicio;
	@Column(name = "fecha_termno")
	@DateTimeFormat(pattern ="yyyy/MM/dd")
	private Date fechaTermino;
	@ManyToOne
	@JoinColumn(name = "codigo_plan_formativo",updatable = false, insertable = false)
	private PlanFormativo planFormativo;
	@ManyToOne
	@JoinColumn(name = "codigo_comuna",updatable = false, insertable = false)
	private Comuna comuna;
	@ManyToMany
    @JoinTable(name = "curso_modulo_tutor",
        joinColumns = @JoinColumn(name = "codigo_curso"),
        inverseJoinColumns = @JoinColumn(name = "codigo_modulo"))
    private List<Modulo> modulos;
	@ManyToMany
	@JoinTable(name = "curso_modulo_tutor",
	        joinColumns = @JoinColumn(name = "codigo_curso"),
	        inverseJoinColumns = @JoinColumn(name = "codigo_tutor"))
	private List<Tutor> tutores;
}
