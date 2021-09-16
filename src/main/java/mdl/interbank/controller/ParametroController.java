package mdl.interbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mdl.interbank.service.ParametroService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@RequestMapping("api/general")
@RestController
public class ParametroController {

	@Autowired
	private ParametroService serviceparametro;

	@GetMapping("estprop")
	public ResponseEntity<?> estadosPropuestas() {
		return ResponseEntity.ok(serviceparametro.findEstadosPropuestas());
	}

}
