package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value = "/test.ap")
	public String appTest() {

		return "appTest";
	}
	
	

}
