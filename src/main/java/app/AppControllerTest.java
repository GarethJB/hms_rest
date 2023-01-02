package app;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class AppControllerTest {

	@Autowired
	@Qualifier("cteam")
	private SqlSession sql;

	@RequestMapping(value = "/getstaff.ap", produces = "text/html; charset=UTF-8")
	public String appTest() {
		return new Gson().toJson(sql.selectList("test.getstaff"));
	}

	@RequestMapping(value = "/stafflogin.ap", produces = "text/html; charset=UTF-8")
	public String staffLogin(String id, String pw) {
		HashMap<String, String> loginMap = new HashMap<>();
		loginMap.put("id", id);
		loginMap.put("pw", pw);
		StaffVO staffVO = sql.selectOne("test.stafflogin", loginMap);
		return new Gson().toJson(staffVO);
	}
}