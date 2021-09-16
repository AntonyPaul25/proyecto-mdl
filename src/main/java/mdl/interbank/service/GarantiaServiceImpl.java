package mdl.interbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cr.microservicios.common.services.CommonServiceImpl;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.Garantia;
import mdl.interbank.entity.ResponseGacCabecera;
import mdl.interbank.feignclient.GacFeignClient;
import mdl.interbank.repository.GarantiaRepository;

@Service
public class GarantiaServiceImpl extends CommonServiceImpl<Garantia, GarantiaRepository> implements GarantiaService {

	@Autowired
	private GacFeignClient clientegac;

	@Autowired
	private GarantiaRepository garantiarepo;

	@Override
	public ResponseGacCabecera listarGAC(HttpHeaders headerMap, ClienteRequest client) {
		return clientegac.listarGAC(headerMap, client);
	}

	@Override
	public List<Garantia> findByCodeid(String codeid) {
		return garantiarepo.findByCodeid(codeid);
	}

}
