package oopProject1.dataAccess;

import oopProject1.entities.Product;

public class HibernateProductDao implements ProductDao {
	
	@Override
	public void add(Product product) {	
		System.out.println("Hibernate İle Veri Tabanına Eklendi");
	}

}
