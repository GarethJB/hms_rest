package app.reception;

import java.util.Map;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

public interface AppReceptionService {
	
	public StaffVO login_staff(Map<String, String> map);
	public PatientVO search_patient(String name);

}
