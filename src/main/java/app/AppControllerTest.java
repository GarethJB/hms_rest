package app;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class AppControllerTest {
	
	@Autowired @Qualifier("test") private SqlSession sql;
	
	@RequestMapping(value = "/getstaff.ap", produces = "text/html; charset=UTF-8")
	public String appTest() {
		return new Gson().toJson(sql.selectList("test.getstaff"));
	}

}