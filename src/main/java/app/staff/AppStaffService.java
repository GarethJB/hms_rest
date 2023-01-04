package app.staff;

import java.util.List;
import java.util.Map;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

public interface AppStaffService {
	
	public StaffVO login_staff(Map<String, String > map);
	public List<StaffVO> get_stafflist();
	public PatientVO search_patient(String name);

}
