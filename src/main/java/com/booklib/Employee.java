package com.booklib;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data	
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
	
	private String id,name,role,salary;
	
}
