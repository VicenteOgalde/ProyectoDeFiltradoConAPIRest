package cl.dojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteCursoDTO {
	
	private String rut;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String codigoCurso;
	private String descripcionCurso;

}
