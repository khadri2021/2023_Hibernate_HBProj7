package com.khadri.hibernate.list;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		List<String> list = new ArrayList<>();
		list.add("veg-food");
		list.add("non-veg-food");
		list.add("non-veg-food");

		Customer customer1 = new Customer();
		customer1.setCustName("BABJAN");
		customer1.setOrders(list);

		session.save(customer1);

		txn.commit();
		session.close();

	}

}
