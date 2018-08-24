package hibernate.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import hibernate.model.Category;
import hibernate.model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        // obtains the session
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        Category category = new Category("Computer");
        
        Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
        
        Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
         
        Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
         
        Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
        
        
        
        
        
        
        Set<Product> products = new HashSet<Product>();
        products.add(pc);
        products.add(laptop);
        products.add(phone);
        products.add(tablet);
         
        category.setProducts(products);
        
        
         
        session.save(category);
        session.save(pc);
        session.getTransaction().commit();
        session.close(); 
        sessionFactory.close();
        
	}

}
