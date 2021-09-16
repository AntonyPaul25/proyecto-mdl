package mdl.interbank.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.ResponseCefCabecera;

@FeignClient(name = "cef", url = "https://10.11.40.40:5020/ibk/sit/api/enterprise-loan/v1/loan-limit/financial-statements")
public interface CefFeignClient {

	@PostMapping
	public ResponseCefCabecera listarCEF(@RequestHeader HttpHeaders headerMap,
			@RequestBody ClienteRequest client);

}
