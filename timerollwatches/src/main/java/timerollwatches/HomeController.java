package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
	@RequestMapping("/register")
	public String register()
	{
		System.out.println("register controller called");
		return "register";
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

