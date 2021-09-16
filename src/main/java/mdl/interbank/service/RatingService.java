package mdl.interbank.service;

import org.springframework.http.HttpHeaders;

import cr.microservicios.common.services.CommonService;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.Rating;

public interface RatingService extends CommonService<Rating> {

	public Rating obtenerRating(HttpHeaders headerMap, ClienteRequest client);

	public Rating findByCodigounico(String codigounico);
	
}
