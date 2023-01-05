package app;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import app.reception.AppReceptionServiceImpl;


@RestController
public class AppReceptionController {
	@Autowired private AppReceptionServiceImpl service;

	
	@RequestMapping(value ="/login.re", produces ="text/html;charset=utf-8")
public String login(String id, String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("pw", pw);
	return new Gson().toJson(service.login_staff(map));
}
}