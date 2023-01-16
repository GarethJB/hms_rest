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
	public String getStaff() {
		return new Gson().toJson(service.get_stafflist());
	}

	@RequestMapping(value = "/stafflogin.ap", produces = "text/html; charset=UTF-8")
	public String staffLogin(String id, String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("pw", pw);
		return new Gson().toJson(service.login_staff(map));
	}
	
	@RequestMapping(value = "/searchpatient.ap", produces = "text/html; charset=UTF-8")
	public String searchPatient(String name) {
		return new Gson().toJson(service.search_patient(name));
	}
	
	@RequestMapping(value = "/updatepatientmemo.ap", produces = "text/html; charset=UTF-8")
	public String updatePatientMemo(String id, String memo) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("memo", memo);
		return String.valueOf(service.update_patient_memo(map));
	}
	
	/*
	 * @RequestMapping(value = "/getmedicalreceipt.ap", produces =
	 * "text/html; charset=UTF-8") public String getMedicalRecipt(String id, String
	 * time) { HashMap<String, String> map = new HashMap<>(); map.put("id", id);
	 * map.put("time", time); return new
	 * Gson().toJson(service.get_medical_receiptlist(map)); }
	 */
}