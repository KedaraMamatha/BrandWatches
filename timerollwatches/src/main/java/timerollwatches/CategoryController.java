package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
