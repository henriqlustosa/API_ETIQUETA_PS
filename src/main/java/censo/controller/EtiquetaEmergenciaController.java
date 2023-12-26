package censo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.EtiquetaEmergenciaDto;

import censo.model.EtiquetaEmergencia;

@RestController
@RequestMapping("/hspmsgh-api/pacientes/consulta")
public class EtiquetaEmergenciaController {
	@GetMapping("/{consulta}")
	public ResponseEntity<EtiquetaEmergencia> getPacientePorConsulta(@PathVariable Long consulta){
		
		EtiquetaEmergencia etiqueta = EtiquetaEmergenciaDto.etiqueta(consulta);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(etiqueta); 
	}

}
