package soa.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
	
	
	@GetMapping("/test")
	public String test() {
		
		
		return "spring - test" ;
	}

}
