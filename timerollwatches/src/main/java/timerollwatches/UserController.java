package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.backend.dao.UsersDao;
import com.backend.model.UsersModel;

@Controller
public class UserController {
	
	@Autowired
	UsersDao usersDao;
	
	@RequestMapping("/test")
	public String Test()
	{
		System.out.println("i m inside the user");
		UsersModel user=new UsersModel();
		user.setFirstName("Adugani");
		user.setLastName("Shavani");
		user.setPassword("123455");
		user.setConformPassword("123455");
		user.setEmailId("aduganishavani@gmail.com");
		usersDao.registerUser(user);
		return "login";
	}
	
	/*@RequestMapping("/register")
	public String registration(Model model)
	{
		UsersModel user=new UsersModel();
		model.addAttribute("user", user);
		System.out.println("register controller called");
		return "register";
	}*/
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registration(Model model,@RequestParam("emailId") String emailId,@RequestParam("password") String password)
	{
		System.out.println("i m inside the user");
		UsersModel user=new UsersModel();
		//model.addAttribute("user", user);
		user.setEmailId(emailId);
		user.setPassword(password);
		usersDao.registerUser(user);
		return "userhome";
	}
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") UsersModel user )
	{
		System.out.println("registerUser called");
		//System.out.println(user.getEmailId());
		boolean b=usersDao.registerUser(user);
		if(b)
		{
			return "login";
		}
		else
		{
			return "register";
		}
//		return "index";
	}

}
