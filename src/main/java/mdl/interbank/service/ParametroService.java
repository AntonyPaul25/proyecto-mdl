package mdl.interbank.service;

import java.util.List;

import cr.microservicios.common.services.CommonService;
import mdl.interbank.entity.Parametro;

public interface ParametroService extends CommonService<Parametro> {

	public List<Parametro> findEstadosPropuestas();

}
