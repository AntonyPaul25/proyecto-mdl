package mdl.interbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mdl.interbank.entity.Cliente;
import mdl.interbank.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repo;

	@Override
	public List<Cliente> filtrar(String prm) {
		//return repo.findByCodigounicoContainingOrNumerodocumentoContainingOrRazonsocialContaining(prm, prm, prm);
		
		return null;
	}

	@Override
	public List<Cliente> filtrar(String codigounico, String numerodocumento, String razonsocial) {
		return repo.filtrar(codigounico, numerodocumento, razonsocial);
	}

}
