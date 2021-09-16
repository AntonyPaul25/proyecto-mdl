package mdl.interbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cr.microservicios.common.services.CommonServiceImpl;
import mdl.interbank.entity.Parametro;
import mdl.interbank.repository.ParametroRepository;
import mdl.interbank.utils.Constants;

@Service
public class ParametroServiceImpl extends CommonServiceImpl<Parametro, ParametroRepository>
		implements ParametroService {

	@Autowired
	private ParametroRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Parametro> findEstadosPropuestas() {
		return repository.findByAgrupadorAndEstadoOrderByOrden(Constants.Parametros.AGRUPADOR_EST_PROP,
				Constants.Estado.ACTIVO);
	}

}
