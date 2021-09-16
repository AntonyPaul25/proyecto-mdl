package mdl.interbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cr.microservicios.common.services.CommonServiceImpl;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.Rating;
import mdl.interbank.feignclient.RtgFeignClient;
import mdl.interbank.repository.RatingRepository;

@Service
public class RatingServiceImpl extends CommonServiceImpl<Rating, RatingRepository> implements RatingService {

	@Autowired
	private RtgFeignClient clienteRTG;

	@Autowired
	private RatingRepository repository;

	@Override
	public Rating obtenerRating(HttpHeaders headerMap, ClienteRequest client) {
		return clienteRTG.obtenerRating(headerMap, client);
	}

	@Override
	public Rating findByCodigounico(String codigounico) {
		return repository.findByCodigounico(codigounico);
	}

}
