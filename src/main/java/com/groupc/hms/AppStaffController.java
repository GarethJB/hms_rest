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

	@RequestMapping(value = "/getStaff.ap", produces = "text/html; charset=UTF-8")
	public String getStaff() {
		return new Gson().toJson(service.get_stafflist());
	}

	@RequestMapping(value = "/staffLogin.ap", produces = "text/html; charset=UTF-8")
	public String staffLogin(String id, String pw) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("pw", pw);
		return new Gson().toJson(service.login_staff(map));
	}
	
	@RequestMapping(value = "/getPatient.ap", produces = "text/html; charset=UTF-8")
	public String getPatient(String name) {
		return new Gson().toJson(service.get_patient(name));
	}
	
	@RequestMapping(value = "/getPatientFromId.ap", produces = "text/html; charset=UTF-8")
	public String getPatientFromId(String id) {
		return new Gson().toJson(service.get_patient_from_id(id));
	}
	
	@RequestMapping(value = "/updateStaffIntroduction.ap", produces = "text/html; charset=UTF-8")
	public String updateStaffIntroduction(String id, String introduction) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("introduction", introduction);
		return String.valueOf(service.update_staff_introduction(map));
	}
	
	@RequestMapping(value = "/updatePatientMemo.ap", produces = "text/html; charset=UTF-8")
	public String updatePatientMemo(String id, String memo) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("memo", memo);
		return String.valueOf(service.update_patient_memo(map));
	}
	
	@RequestMapping(value = "/getMedicalReceipt.ap", produces = "text/html; charset=UTF-8")
	public String getMedicalRecipt(String id, String time) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("time", time);
		return new Gson().toJson(service.get_medical_receiptlist(map));
	}
	
	@RequestMapping(value = "/getMedicalRecord.ap", produces = "text/html; charset=UTF-8")
	public String getMedicalRecord(String id, String patient_name, String first_date, String second_date, String option) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("patient_name", patient_name);
		map.put("first_date", first_date);
		map.put("second_date", second_date);
		map.put("option", option);
		return new Gson().toJson(service.get_medical_recordlist(map));
	}
	
	@RequestMapping(value = "/getPrescription.ap", produces = "text/html; charset=UTF-8")
	public String getPrescription(String id) {
		return new Gson().toJson(service.get_prescription(id));
	}
	
	@RequestMapping(value = "/updateMedicalRecordMemo.ap", produces = "text/html; charset=UTF-8")
	public String updateMedicalRecordMemo(String id, String memo) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("memo", memo);
		return String.valueOf(service.update_medical_record_memo(map));
	}
	
	@RequestMapping(value = "/getAdmissionRecordWard.ap", produces = "text/html; charset=UTF-8")
	public String getAdmissionRecordWard(String ward_id) {
		return new Gson().toJson(service.get_admission_record_ward(ward_id));
	}
	
	@RequestMapping(value = "/updateDischargeDate.ap", produces = "text/html; charset=UTF-8")
	public String updateDischargeDate(String id, String date) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("date", date);
		return String.valueOf(service.update_discharge_date(map));
	}
	
	
	
	
}