package mdl.interbank.controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import feign.FeignException;
import mdl.interbank.entity.ClienteRequest;
import mdl.interbank.entity.LogMDL;
import mdl.interbank.entity.Rating;
import mdl.interbank.service.RatingService;
import mdl.interbank.service.LogMDLService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RequestMapping("api/rtg")
public class RtgController {

	@Autowired
	private RatingService servicecliente;

	@Autowired
	private LogMDLService logservice;

	@GetMapping
	public ResponseEntity<?> prueba() {
		return ResponseEntity.ok("ok");
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> obtenerRTG(@Valid @RequestBody ClienteRequest clientrequest, BindingResult result)
			throws Exception {

		if (result.hasErrors()) {
			return this.validar(result);
		}

		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Format formatterMessage = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBasicAuth("uBseGenuat", "Ibk2018$");
		headers.add("X-INT-Timestamp", formatter.format(new Date()));
		headers.add("X-IBM-Client-Id", "a3a383ba-3d4d-4a35-a85e-0cd0f09eae26");
		headers.add("X-INT-Service-Id", "ATM");
		headers.add("X-INT-Net-Id", "IS");
		headers.add("X-INT-Branch-Id", "100");
		headers.add("X-INT-Consumer-Id", "ATM");
		headers.add("X-INT-Message-Id", formatterMessage.format(new Date()));
		headers.add("X-INT-User-Id", "BSE0000");

		Rating clientertg = new Rating();

		try {
			clientertg = servicecliente.obtenerRating(headers, clientrequest);
			clientertg.setNumsolicitud(clientrequest.getNumsolicitud());
			clientertg.setCodigounico(clientrequest.getCodeId());
			servicecliente.save(clientertg);
		} catch (FeignException errorFeign) {
			// throw new Exception(feigne.contentUTF8());
			System.out.println("errorFeign.toString() => " + errorFeign.toString());
			System.out.println("errorFeign.contentUTF8() => " + errorFeign.contentUTF8());
			System.out.println("errorFeign.getMessage() => " + errorFeign.getMessage());
			logservice.save(new LogMDL("num solicitud: " + clientrequest.getNumsolicitud().toString() + " -- "
					+ errorFeign.contentUTF8()));
			return new ResponseEntity<>(errorFeign.contentUTF8(), HttpStatus.OK);
		}

		return ResponseEntity.ok(clientertg);
	}

	protected ResponseEntity<?> validar(BindingResult result) {
		Map<String, Object> errores = new HashMap<>();
		result.getFieldErrors().forEach(err -> {
			errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
		});
		return ResponseEntity.badRequest().body(errores);
	}

	protected ResponseEntity<?> returnDummy() {

		String json = "{\r\n" + "    \"seicode\": \"11\",\r\n" + "    \"sei\": \"Mineria\",\r\n"
				+ "    \"scaleWithoutException\": \"CC\",\r\n" + "    \"scaleWithException\": \"CC\",\r\n"
				+ "    \"SEICode\": \"11\",\r\n" + "    \"SEI\": \"Mineria\",\r\n"
				+ "    \"financialStatusPeriod\": \"2021-19-05 20:40:11\",\r\n"
				+ "    \"updateDate\": \"2021-19-05 20:40:26\"\r\n" + "}";

		return ResponseEntity.ok(json);
	}

}
