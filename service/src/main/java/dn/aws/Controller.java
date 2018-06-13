package dn.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("service")
	public String getServiceName() {
		return "Service 1";
	}
	
}
