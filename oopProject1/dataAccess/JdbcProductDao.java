package oopProject1.dataAccess;

import oopProject1.entities.Product;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Jdbc İle Veri Tabanına Eklendi");		
	}

}
