package com.example.manytomanymapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.manytomanymapper.mapping.DemoController;
import com.example.manytomanymapper.mapping.Employee;
import com.example.manytomanymapper.mapping.Project;



@SpringBootApplication
public class ManytomanymapperApplication implements CommandLineRunner {
	@Autowired
	DemoController control;
	public static void main(String[] args) {
		SpringApplication.run(ManytomanymapperApplication.class, args);
	}
	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Employee e = new Employee();
		e.setName("anil");
		Employee e1 = new Employee();
		e1.setName("satya");
		Project pro = new Project();
		pro.setName("hsbc");
		Project pro1 = new Project();
		pro1.setName("jpmorgan");
		Set<Project> proList = new HashSet<>();
		proList.add(pro);
		proList.add(pro1);
		Set<Project> proList1 = new HashSet<>();
		proList1.add(pro);
		proList1.add(pro1);
		e.setProjectList(proList);

		e1.setProjectList(proList1);

		Set<Employee> list = new HashSet<>();

		Set<Employee> list1 = new HashSet<>();
		list.add(e);
		list1.add(e1);
		pro.setList(list);
		pro1.setList(list1);
		control.save(e);
		control.save(e1);
	}
}
