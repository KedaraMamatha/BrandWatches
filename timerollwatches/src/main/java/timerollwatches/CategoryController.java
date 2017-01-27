package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.CategoryDao;
import com.backend.model.CategoryModel;

@Controller
public class CategoryController {

	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/test2")
	public String Test2()
	{
		System.out.println("i m inside the category");
		CategoryModel categoryModel=new CategoryModel();
		categoryModel.setCategoryName("chargers");
		categoryDao.addCategory(categoryModel);
		return "login";
	}
	@RequestMapping("/category")
	public String Category(Model model)
	{
		CategoryModel category=new CategoryModel();
		model.addAttribute("category", category);
		System.out.println("category controller called");
		return "category";
	}
	@RequestMapping("/categoryUser")
	public String CategoryUser(@ModelAttribute("category")CategoryModel category)
	{
		System.out.println("categories inserted");
		boolean b=categoryDao.addCategory(category);
		if (b)
		{
			return "sucess";
		} 
		else
		{
			return "login";
		}
	}
}
 