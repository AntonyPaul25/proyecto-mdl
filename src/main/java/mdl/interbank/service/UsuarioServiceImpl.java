package mdl.interbank.service;

import org.springframework.stereotype.Service;

import cr.microservicios.common.services.CommonServiceImpl;
import mdl.interbank.entity.Usuario;
import mdl.interbank.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl extends CommonServiceImpl<Usuario, UsuarioRepository> implements UsuarioService {

}
