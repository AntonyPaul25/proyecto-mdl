package mdl.interbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cr.microservicios.common.services.CommonServiceImpl;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.EstadoFinanciero;
import mdl.interbank.entity.ResponseCefCabecera;
import mdl.interbank.feignclient.CefFeignClient;
import mdl.interbank.repository.EstadoFinancieroRepository;

@Service
public class EstadoFinancieroServiceImpl extends CommonServiceImpl<EstadoFinanciero, EstadoFinancieroRepository>
		implements EstadoFInancieroService {

	@Autowired
	private CefFeignClient clienteRTG;

	@Autowired
	private EstadoFinancieroRepository estadofinancierorepo;

	@Override
	public ResponseCefCabecera listarCEF(HttpHeaders headerMap, ClienteRequest client) {
		return clienteRTG.listarCEF(headerMap, client);
	}

	@Override
	public List<EstadoFinanciero> findByCodigounico(String codigounico) {
		return estadofinancierorepo.findByCodigounico(codigounico);
	}

}
