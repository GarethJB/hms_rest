package app.reception;

import java.util.List;
import java.util.Map;

import app.reception.vo.WardVO;
import app.reception.vo.MedicalReceiptVO;
import app.reception.vo.MedicalRecordVO;
import app.reception.vo.PrescriptionVO;
import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

public interface AppReceptionService {
	
	public StaffVO login_staff(Map<String, String> map);  //로그인
	public List<PatientVO> search_patient(String name);		//환자이름검색
	public List<PatientVO> search_patient_id(int id);		//환자 아이디 검색
	public List<MedicalReceiptVO> search_patient_appointment(int id); 
	public List<MedicalRecordVO> search_medical_record(Map<String, String> map);//진료이력조회 by map
	public List<MedicalRecordVO> search_medical_record1(String id);//진료이력조회

	public List<MedicalRecordVO> search_appointment_department(Map<String, String> map); //예약정보리스트 가져오기
	public List<PrescriptionVO> search_prescription(int id);
	public List<WardVO> search_ward(int id);
		
	public List<MedicalReceiptVO> search_appointment(Map<String, String> map);
	//public List<MedicalReceiptVO> search_appointment_department(String department);
	
	//public List<StaffVO>search_department(int id);
	

	

}
