package mdl.interbank.controller;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RequestMapping("api/test")
@RestController
public class MensajeController {

	@GetMapping
	public ResponseEntity<?> prueba() throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {

		TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

		SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy)
				.build();

		SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

		CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();

		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

		requestFactory.setHttpClient(httpClient);

		RestTemplate restTemplate = new RestTemplate(requestFactory);

		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Format formatterMessage = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");

		String url = "https://dpiuat.grupoib.local:7020/ibk/uat/api/enterprise-loan/v1/loan-limit/rating";

		// create headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// add basic authentication
		headers.setBasicAuth("uBseGenuat", "Ibk2018$");

		// headers.add("Authorization", "Basic dUJzZUdlblVhdDpJYmsyMDE4JA==");
		headers.add("X-INT-Timestamp", formatter.format(new Date()));
		headers.add("X-IBM-Client-Id", "a3a383ba-3d4d-4a35-a85e-0cd0f09eae26");
		headers.add("X-INT-Service-Id", "ATM");
		headers.add("X-INT-Net-Id", "IS");
		headers.add("X-INT-Branch-Id", "100");
		headers.add("X-INT-Consumer-Id", "ATM");
		headers.add("X-INT-Message-Id", formatterMessage.format(new Date()));
		headers.add("X-INT-User-Id", "BSE0000");

		// headers.set("X-INT-Device-Id", "0");
		// headers.set("APIm-Debug", "true");
		// headers.set("X-INT-Supervisor-Id", "SXFL0000");

		Map<String, Object> bodymap = new HashMap<String, Object>();
		bodymap.put("codeID", "0050002375");
		bodymap.put("documentIdType", "1");
		bodymap.put("documentIdNumber", "20517698131");

		// build the request
		HttpEntity<Map<String, Object>> entity = new HttpEntity<>(bodymap, headers);

		// send POST request
		ResponseEntity<Object> response = restTemplate.postForEntity(url, entity, Object.class);

		System.out.println(response.getBody().toString());

		// System.out.println(data.toString());
		return ResponseEntity.ok(response.getBody());

	}

}
