package oopProject1;

import oopProject1.business.ProductManager;
import oopProject1.core.logging.DataBaseLogger;
import oopProject1.core.logging.FileLogger;
import oopProject1.core.logging.Logging;
import oopProject1.core.logging.MailLogger;
import oopProject1.dataAccess.HibernateProductDao;
import oopProject1.dataAccess.JdbcProductDao;
import oopProject1.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product("C", "Engin", 100, "Yazılım");
		Product product2 = new Product("Java", "Engin", 20, "Programlama");
		Product product3 = new Product("C", "Engin", 220, "Yazılım"); 
		
		Logging [] loggers = {new MailLogger(), new FileLogger(), new DataBaseLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);

	}

}
