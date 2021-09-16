package mdl.interbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mdl.interbank.service.ClienteService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RequestMapping("api/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping("/filtrar/{filtro}")
	public ResponseEntity<?> filtrar(@PathVariable String filtro) {
		if (filtro.isBlank()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Se esperaba un valor para filtrar");
		}

		return ResponseEntity.status(HttpStatus.OK).body(service.filtrar(filtro));

	}

	@GetMapping("/filtrar")
	public ResponseEntity<?> filtrarPorCampos(@RequestParam(required = false) String codigounico,
			@RequestParam(required = false) String numerodocumento,
			@RequestParam(required = false) String razonsocial) {

		return ResponseEntity.status(HttpStatus.OK).body(service.filtrar(codigounico, numerodocumento, razonsocial));

	}

}
