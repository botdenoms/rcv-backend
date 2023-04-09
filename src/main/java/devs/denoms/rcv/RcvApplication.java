package devs.denoms.rcv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RcvApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcvApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "your did it";
	}

}
