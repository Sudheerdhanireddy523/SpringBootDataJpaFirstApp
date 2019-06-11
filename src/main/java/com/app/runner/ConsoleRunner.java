package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repo.getClass().getName());
		
		Product p=repo.save(new Product("sudheer", 34.89));
		System.out.println(p.getProdId());
		Product p1=repo.save(new Product("kumar", 45.87));
		System.out.println(p1.getProdId());
		Product p2=repo.save(new Product("reddy", 23.65));
		System.out.println(p2.getProdId());
		
	}

}
