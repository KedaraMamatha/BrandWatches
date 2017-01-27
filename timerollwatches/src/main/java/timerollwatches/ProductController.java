package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.ProductDao;
import com.backend.model.ProductModel;

@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/test1")
	public String Test1()
	{
		System.out.println("i m inside product");
		ProductModel productModel=new ProductModel();
		productModel.setProductName("5 Star");
		productModel.setPrice(2000);
		productDao.addProduct(productModel);
		return "login";
	}
	@RequestMapping("/product")
	public String product(Model model)
	{
		ProductModel product=new ProductModel();
		model.addAttribute("product", product);
	  System.out.println("product controller called");
	  return "product";
	}
	@RequestMapping("/productUser")
	public String productUser(@ModelAttribute("product") ProductModel product)
	{
	  System.out.println("productUser controller called");
	  boolean b=productDao.addProduct(product);
	  if (b)
	  {
		  return "registercompleted";
	  }
	  else
	  {
		  
	  }
	  return "login";
	}
	

}
