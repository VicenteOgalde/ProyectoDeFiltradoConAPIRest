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
@Table(name="plan_formativo")
public class PlanFormativo {

	@Id
	@GeneratedValue
	@Column(name = "codigo_plan_formativo")
	private String planFormativoId;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "duracion_horas")
	private int duracionEnHoras;


}
