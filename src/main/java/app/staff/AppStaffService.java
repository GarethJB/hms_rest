package app.staff;

import java.util.List;
import java.util.Map;

import app.staff.vo.MedicalReceiptVO;
import app.staff.vo.MedicalRecordVO;
import app.staff.vo.PatientVO;
import app.staff.vo.PrescriptionVO;
import app.staff.vo.StaffVO;
import app.staff.vo.AdmissionRecordVO;

public interface AppStaffService {
	
	public StaffVO login_staff(Map<String, String > map);
	public List<StaffVO> get_stafflist();
	public List<PatientVO> get_patient(String name);
	public PatientVO get_patient_from_id(String id);
	public int update_staff_introduction(Map<String, String> map);
	public int update_patient_memo(Map<String, String> map);
	public List<MedicalReceiptVO> get_medical_receiptlist(Map<String, String> map);
	public List<MedicalRecordVO> get_medical_recordlist(Map<String, String> map);
	public PrescriptionVO get_prescription(String id);
	public int update_medical_record_memo(Map<String, String> map);
	public List<AdmissionRecordVO> get_admission_record_ward(String ward_number);
	public int update_discharge_date(Map<String, String> map);

}
