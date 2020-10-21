package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.foodwiring.FoodPanda;


@SpringBootApplication
public class TrailOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrailOneApplication.class, args);
	}
	
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		/*Employee employee = context.getBean("employee",Employee.class);
		Student student = context.getBean("student",Student.class);
		System.out.println(employee);
		System.out.println(student);*/
		//ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
		//shapeFactory.printArea(20, 30);
		
		FoodPanda foodPanda = context.getBean(FoodPanda.class);
		List<String> l = foodPanda.showMenu("chinese");
		for (String s : l) {
			System.out.println(s);
		}
		
		
	}
	

}
