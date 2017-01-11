package timerollwatches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
