package app.staff;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.google.gson.JsonElement;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Repository
public class AppStaffDAO implements AppStaffService {
	
	@Autowired
	@Qualifier("cteam")
	private SqlSession sql;

	@Override
	public List<PatientVO> search_patient(String name) {
		return sql.selectList("staff.search_patient", name);
	}

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		return sql.selectOne("staff.login_staff", map);
	}

	@Override
	public List<StaffVO> get_stafflist() {
		return sql.selectList("staff.get_staff");
	}

	@Override
	public int update_patient_memo(Map<String, String> map) {
		return sql.update("staff.update_patient_memo", map);
	}

//	@Override
//	public List<MedicalReceiptVO> get_medical_receiptlist(Map<String, String> map) {
//		return sql.selectList("staff.get_medical_receipt", map);
//	}

}
