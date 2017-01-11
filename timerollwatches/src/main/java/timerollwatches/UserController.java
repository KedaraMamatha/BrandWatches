package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.UsersDao;
import com.backend.model.UsersModel;

@Controller
public class UserController {
	
	@Autowired
	UsersDao usersDao;

	@RequestMapping("/test")
 String Test()
	{
		System.out.println("i m inside the user");
		UsersModel user=new UsersModel();
		user.setUsername("computer");
		user.setPassword("machine");
		usersDao.registerUser(user);
		return "login";
	}

}
