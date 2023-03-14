package com.khadri.hibernate.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.khadri.hibernate.map.College;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		College college = session.get(College.class, 1);

		System.out.println(college.getClgId());
		System.out.println(college.getClgName());
		System.out.println(college.getHods());
		
		
		session.close();

	}
}
