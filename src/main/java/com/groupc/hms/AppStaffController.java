package com.groupc.hms;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import app.staff.AppStaffServiceImpl;

@RestController
public class AppStaffController {

	@Autowired private AppStaffServiceImpl service;

	@RequestMapping(value = "/getstaff.ap", produces = "text/html; charset=UTF-8")
	public String appTest() {
		return new Gson().toJson(service.get_stafflist());
	}

	@RequestMapping(value = "/stafflogin.ap", produces = "text/html; charset=UTF-8")
	public String staffLogin(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>();
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		return new Gson().toJson(service.login_staff(loginMap));
	}
}