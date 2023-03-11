package com.khadri.hibernate.map;

import java.util.HashMap;
import java.util.Map;

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

		Map<String, String> map1 = new HashMap<>();

		map1.put("JHON", "JAVA");
		map1.put("ALLEN", "PHYTHON");
		map1.put("COSTIN", "ORACLE");

		College clg1 = new College();
		clg1.setClgName("KHADRI");
		clg1.setHods(map1);

		session.persist(clg1);

		txn.commit();
		session.close();
		factory.close();
	}
}
