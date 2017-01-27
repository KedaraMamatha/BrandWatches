package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.backend.dao.UsersDao;

@Controller
public class HomeController {
	
	@Autowired
	UsersDao usersDao;
	
	@RequestMapping("/adminhome")
	public String admin()
	{
		System.out.println("i m inside the admin");
		return "adminhome";
	}
	
	@RequestMapping("/userhome")
	public String user()
	{
		System.out.println("i m inside the user");
		return "userhome";
	}
	@RequestMapping("/logout")
	public String logout()
	{
		System.out.println("Logout Controller Called");
		return "logout";
	}
	@RequestMapping("/")
	public String index()
	{
		System.out.println("controller called");
		return "index";
	}
	@RequestMapping("/login")
	public String login()
	{
	  System.out.println("login controller called");
	  return "login";
	}
	
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		System.out.println("aboutus controller called");
		return "aboutus";
	}
	@RequestMapping("/contactus")
	public String contactus()
	{
		System.out.println("contactus controller called");
		return "contactus";
	}
}

