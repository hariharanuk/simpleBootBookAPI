package com.booklib;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompartorLambdas {

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<>();
		ls.add(Employee.builder().id("1").name("Zebra").role("Tester").salary("100").build());
		ls.add(Employee.builder().id("4").name("Bison").role("Devloper").salary("100").build());
		ls.add(Employee.builder().id("5").name("Lion").role("Client").salary("100").build());
		ls.add(Employee.builder().id("3").name("Tiger").role("Network").salary("100").build());
		ls.add(Employee.builder().id("2").name("Samba").role("Junior").salary("100").build());
		
		//B4 J8
		System.out.println("----------------B4-J8--------------------");
		System.out.println();
		ls.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {				
				return o1.getName().compareTo(o2.getName());
			}			
		} );
		
		ls.forEach(System.out::println);
		System.out.println();
		
		System.out.println("----------------Java-8-Lambdas--------------------");
		System.out.println();
		
		ls.sort((Employee e1, Employee e2) -> {return e1.getName().compareTo(e2.getName());});
		
		ls.forEach(System.out::println);
		

		System.out.println();
		System.out.println("----------------Java-8-Lambdas-Sorting by Id--------------------");
		System.out.println();
		
		ls.sort((Employee e1, Employee e2) -> {return e1.getId().compareTo(e2.getId());});
		
		ls.forEach(System.out::println);
		
		System.out.println();
		System.out.println("----------------Java-8-Lambdas-Sorting by role--------------------");
		System.out.println();
		
		ls.sort((Employee e1, Employee e2) -> {return e1.getRole().compareTo(e2.getRole());});
		
		ls.forEach(System.out::println);
	}
}
