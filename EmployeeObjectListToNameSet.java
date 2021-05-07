package assignment;

import java.util.*;

class Employee {

	private String name;

	Employee() {

	}

	Employee(String name) {
		this.name = name;

	}
	
	public String getName() {
		return this.name;
	}

}

public class EmployeeObjectListToNameSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e1 = new Employee("John");
			Employee e2 = new Employee("Richard");
			Employee e3 = new Employee("Sam");
			Employee e4 = new Employee("John");
			
			List<Employee> l = new ArrayList<Employee>();
			
			l.add(e1);
			l.add(e2);
			l.add(e3);
			l.add(e3);
			l.add(e4);
				
			System.out.println("Employee Name list:");
			for(Employee e: l)
			{
				System.out.println(e.getName());
			}
			
			HashSet<Employee> set = new HashSet<>(l);
			System.out.println("\nUnique values by converting to into set:");
			
			for(Employee e: set)
			{
				System.out.println(e.getName());
			}
	}

}
