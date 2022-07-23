package cl.dojo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modulo")
public class Modulo {

	@Id
	@GeneratedValue
	@Column(name = "codigo_modulo")
	private int moduloId;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "duracion_horas")
	private int duracionEnHoras;
	@ManyToMany
    @JoinTable(name = "curso_modulo_tutor",
        joinColumns = @JoinColumn(name = "codigo_modulo"),
        inverseJoinColumns = @JoinColumn(name = "codigo_tutor"))
    private List<Tutor> tutores;
	@ManyToMany
    @JoinTable(name = "plan_modulo",
        joinColumns = @JoinColumn(name = "codigo_modulo"),
        inverseJoinColumns = @JoinColumn(name = "codigo_plan_formativo"))
    private List<PlanFormativo> planesFormativos;
	
	
}
