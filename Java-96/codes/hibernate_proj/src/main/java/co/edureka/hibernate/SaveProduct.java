package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Product;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
				
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Product prod = new Product();
		prod.setProductId(22513);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(72500f);
		
		session.save(prod);
		
		System.out.println("--------------------------------------------------------------------");
		
		tx.commit();
		System.out.println("Product added to stock!!");
		
		session.close();
		sfactory.close();

	}

}
