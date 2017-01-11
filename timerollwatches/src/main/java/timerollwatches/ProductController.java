package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

}
