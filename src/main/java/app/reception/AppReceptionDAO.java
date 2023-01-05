package app.reception;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import app.staff.vo.PatientVO;
import app.staff.vo.StaffVO;

@Repository
public class AppReceptionDAO implements AppReceptionService {
	
	@Autowired
	@Qualifier("cteam")
	private SqlSession sql;

	@Override
	public StaffVO login_staff(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sql.selectOne("re.login", map);
	}

	@Override
	public PatientVO search_patient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
