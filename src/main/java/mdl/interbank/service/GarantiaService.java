package mdl.interbank.service;

import java.util.List;

import org.springframework.http.HttpHeaders;

import cr.microservicios.common.services.CommonService;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.Garantia;
import mdl.interbank.entity.ResponseGacCabecera;

public interface GarantiaService extends CommonService<Garantia> {

	public ResponseGacCabecera listarGAC(HttpHeaders headerMap, ClienteRequest client);

	public List<Garantia> findByCodeid(String codeid);

}
