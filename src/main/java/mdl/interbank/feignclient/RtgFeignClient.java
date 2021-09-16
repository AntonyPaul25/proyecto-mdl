package mdl.interbank.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.Rating;

@FeignClient(name = "rtg", url = "https://10.11.32.73:7020/ibk/uat/api/enterprise-loan/v1/loan-limit/rating")
public interface RtgFeignClient {

	@PostMapping
	public Rating obtenerRating(@RequestHeader HttpHeaders headerMap,@RequestBody ClienteRequest client);
	

}
