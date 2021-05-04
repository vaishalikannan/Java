package emp;

import java.util.Scanner;

public class Employee {
	Scanner scan = new Scanner (System.in);
	
	public void empId(){
		
		System.out.println("Enter your employee details");
		int empid = scan.nextInt();		
		
		System.out.println("Enter your Employee ID:");
		System.out.println(empid);
	}
public void empName(){
	
	String empname = scan.nextLine();
    System.out.println("Employee Name:"  +empname);
}

public void empPhone(){
	double empph =scan.nextDouble();
	System.out.println("Employee PhNo:"              );
	System.out.println(empph);
}

public void empsalary(){
	float empsalary=scan.nextFloat();
	System.out.println("Employee Salary:");
	System.out.println(empsalary);
}
public void empGender(){
	String empgen=scan.next();
	System.out.println("Employee Gender:");
	System.out.println(empgen);
}
public void empCity(){
	String empcity=scan.nextLine();
	System.out.println("Employee City:");
	System.out.println(empcity);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.empName();
	e.empPhone();
	e.empCity();
	e.empsalary();
	e.empGender();
}

}
