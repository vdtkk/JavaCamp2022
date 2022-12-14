package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;



public class Main {

	public static void main(String[] args) throws Exception {

	Product product1=new Product(1,"ıphone xr",9000);
		
		
		Logger loggers= {new DatabaseLogger(), new MailLogger()};
	
		ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
		

	}

}
