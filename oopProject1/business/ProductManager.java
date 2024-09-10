package oopProject1.business;

import java.util.HashSet;
import java.util.Set;

import oopProject1.core.logging.Logging;
import oopProject1.dataAccess.ProductDao;
import oopProject1.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logging[] loggers;
	private static Set<String> courseNames = new HashSet<>();
	private static Set<String> categoryNames = new HashSet<>(); 

	
	
	
	
	public ProductManager (ProductDao productDao,Logging[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
	}
	
	
	
	public void add (Product product) throws Exception {
		
		if (courseNames.contains(product.getCourseName())) {
			throw new Exception("Kurs İsimleri Tekrar Edemez");
        }
		 courseNames.add(product.getCourseName());
		 
		 if (categoryNames.contains(product.getCategoryName())) {
			 throw new Exception("Kategori İsimleri Tekrar Edemez");
	            
	        }
		 categoryNames.add(product.getCategoryName());
		
		
		if (product.getUnitPrice()<10) {
			throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz");
		}
		
		productDao.add(product);
		
		for (Logging logging : loggers) {
		logging.log(product.getCourseName(), product.getCategoryName(), product.getTeacherName());
		}
		
	}

}
