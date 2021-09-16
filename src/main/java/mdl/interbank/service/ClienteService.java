package mdl.interbank.service;

import java.util.List;

import mdl.interbank.entity.Cliente;

public interface ClienteService {

	public List<Cliente> filtrar(String prm);

	public List<Cliente> filtrar(String codigounico, String numerodocumento, String razonsocial);

}
