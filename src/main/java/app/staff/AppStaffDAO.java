package app.staff;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Repository
public class AppStaffDAO implements AppStaffService {
	
	@Autowired
	@Qualifier("cteam")
	private SqlSession sql;

	@Override
	public PatientVO search_patient(String name) {
		return sql.selectOne("");
	}

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		return sql.selectOne("staff.login", map);
	}

	@Override
	public List<StaffVO> get_stafflist() {
		return sql.selectList("staff.getstaff");
	}

}