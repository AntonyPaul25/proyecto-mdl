package mdl.interbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MdlInterbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdlInterbankApplication.class, args);
	}

}
