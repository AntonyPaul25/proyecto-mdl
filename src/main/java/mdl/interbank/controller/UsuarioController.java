package mdl.interbank.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cr.microservicios.common.controller.CommonController;
import mdl.interbank.entity.Usuario;
import mdl.interbank.service.UsuarioService;
import mdl.interbank.utils.Constants;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
@RequestMapping("api/ejecutivos")
@RestController
public class UsuarioController extends CommonController<Usuario, UsuarioService> {

	@Override
	public ResponseEntity<?> obtener(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.badRequest().body(Constants.Mensajes.METODO_NO_PERMITIDO);
	}

	@Override
	public ResponseEntity<?> crear(@Valid Usuario entity, BindingResult result) {
		// TODO Auto-generated method stub
		return ResponseEntity.badRequest().body(Constants.Mensajes.METODO_NO_PERMITIDO);
	}

	@Override
	public ResponseEntity<?> eliminar(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.badRequest().body(Constants.Mensajes.METODO_NO_PERMITIDO);
	}

}
