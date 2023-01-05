package app.reception;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Service
public class AppReceptionServiceImpl implements AppReceptionService {
	
	@Autowired
	private AppReceptionDAO dao;

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientVO search_patient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
