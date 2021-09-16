package mdl.interbank.service;

import java.util.List;

import org.springframework.http.HttpHeaders;

import cr.microservicios.common.services.CommonService;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.EstadoFinanciero;
import mdl.interbank.entity.ResponseCefCabecera;

public interface EstadoFInancieroService extends CommonService<EstadoFinanciero> {

	public ResponseCefCabecera listarCEF(HttpHeaders headerMap, ClienteRequest client);

	public List<EstadoFinanciero> findByCodigounico(String codigounico);

}
