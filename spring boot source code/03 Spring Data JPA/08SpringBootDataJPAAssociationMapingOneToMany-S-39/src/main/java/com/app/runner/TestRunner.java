package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entiy.Order;
import com.app.entiy.Product;
import com.app.repository.OrderRepository;
import com.app.repository.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository prepo;
	
	@Autowired
	private OrderRepository orepo;

	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product(1501, "PEN", 20.0);
		Product p2 = new Product(1501, "BTL", 40.0);
		Product p3 = new Product(1501, "BOX", 30.0);
		
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);
		
		Order ord = new Order(2301,"ONLINE",5.0,Arrays.asList(p1,p2,p3));
		orepo.save(ord);
		
	}

}
