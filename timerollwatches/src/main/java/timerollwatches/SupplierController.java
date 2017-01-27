package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.SupplierDao;
import com.backend.model.SupplierModel;

@Controller
public class SupplierController {

	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping("/test3")
	public String Test3()
	{
		System.out.println("i m inside the supplier");
		SupplierModel supplierModel=new SupplierModel();
		supplierModel.setSupplierName("Casio");
		supplierModel.setSupplierAddress("USA");
		supplierDao.addSupplier(supplierModel);
		return "login";
	}
	@RequestMapping("/supplier")
	public String Supplier(Model model)
	{
		System.out.println("supplier controller called");
		SupplierModel supplier=new SupplierModel();
		model.addAttribute("supplier", supplier);
		return "supplier";
	}
	@RequestMapping("/supplierUser")
	public String SupplierUser(@ModelAttribute("supplier") SupplierModel supplier)
	{
		System.out.println("supplier added ");
		boolean b=supplierDao.addSupplier(supplier);
		if(b)
		{
			return "sucess";	
		}
		else
		{
			return "login";
		}
		
	}
	
}
