package com.khadri.hibernate.combo.list.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

		List<String> apps1 = new ArrayList<>();
		apps1.add("FB");
		apps1.add("WHATSAPP");
		apps1.add("FB");
		apps1.add("INSTA");
		apps1.add("FRIENDS");

		Set<String> numbers1 = new LinkedHashSet<>();
		numbers1.add("9440877300");
		numbers1.add("9440877301");
		numbers1.add("9440877302");
		numbers1.add("9440877303");
		numbers1.add("9440877300");

		List<String> apps2 = new ArrayList<>();
		apps2.add("MI Store");
		apps2.add("MI APPS");
		apps2.add("MI KJJK");
		apps2.add("MI MAPS");
		apps2.add("MI APPS");

		Set<String> numbers2 = new LinkedHashSet<>();
		numbers2.add("8440877300");
		numbers2.add("8440877301");
		numbers2.add("8440877302");
		numbers2.add("8440877303");
		numbers2.add("8440877300");

		Phone p1 = new Phone();
		p1.setPhnName("APPLE");
		p1.setPhnApps(apps1);
		p1.setPhnNumbers(numbers1);

		Phone p2 = new Phone();
		p2.setPhnName("MI");
		p2.setPhnApps(apps2);
		p2.setPhnNumbers(numbers2);

		session.save(p1);
		session.save(p2);

		txn.commit();
		session.close();
		factory.close();

	}
}
