package app.staff;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Service
public class AppStaffServiceImpl implements AppStaffService {
	
	@Autowired private AppStaffDAO dao;

	@Override
	public PatientVO search_patient(String name) {
		return dao.search_patient(name);
	}

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		return dao.login_staff(map);
	}

	@Override
	public List<StaffVO> get_stafflist() {
		return dao.get_stafflist();
	}

}
