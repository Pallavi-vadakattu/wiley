package wileyproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare{
public static void main(String[] args) {
	Compare c=new Compare();
	
	ArrayList<Employee> emp = new ArrayList<Employee>();
	 
	emp.add(c.new Employee("E1","Hyderabad",20000));
	emp.add(c.new Employee("E2","Delhi",10000));
	emp.add(c.new Employee("E3","Hyderabad",10000));
	emp.add(c.new Employee("E4","Delhi",15000));
	emp.add(c.new Employee("E5","Banglore",30000));
	emp.add(c.new Employee("E6","Banglore",10000));
	emp.add(c.new Employee("E7","Hyderabad",20000));
	emp.add(c.new Employee("E8","Delhi",10000));
//	for (Employee employee : emp) {
//		System.out.println(employee.name+"  "+employee.city+"  "+employee.salary);
//	}
	Collections.sort(emp,c.new Employee());
	System.out.println("After sorting");
	for (Employee employee : emp) {
		System.out.println(employee.name+"  "+employee.city+"  "+employee.salary);
	}
	
}
class Employee implements Comparator{
	public String name;
	public String city;
	public double salary;
	public Employee()
	{
		
	}
	public Employee(String name,String city,double salary)
	{
		this.name=name;
		this.city=city;
		this.salary=salary;
	}
	 public int compare(Object o1, Object o2) {
	       Employee e1=(Employee)o1;
	       Employee e2=(Employee)o2;
	     
	        if(e1.city.compareTo(e2.city)!=0)
	        {
	        	return e1.city.compareTo(e2.city);
	        }
	        double sal1=e1.salary;
	        double sal2=e2.salary;
	       if(sal1>sal2)
	    	   return 1;
	       else if(sal2>sal1)
	    	   return -1;
	       else 
	    	   return 0;
	
	 
	    }
	}
}
