package com.mph.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mph.model.Employee;
import com.mph.model.Salary;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	Salary sal = new Salary();
	Scanner sc = new Scanner(System.in);
	List<Employee> emplist = new ArrayList<Employee>();

	public void addEmployee() {
		emp = new Employee();
		System.out.println("Enter your Name:");
		String name = sc.next();
		emp.setEname(name);

		System.out.println("Enter Basic");
		int basic = sc.nextInt();
		sal.setBasic(basic);

		System.out.println("Enter Da");
		int da = sc.nextInt();
		sal.setDa(da);

		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		sal.setHra(hra);

		System.out.println("Enter PF");
		int pf = sc.nextInt();
		sal.setPf(pf);

		sal.setGross();
		sal.setNet();

		emp.setSalary(sal);
		emplist.add(emp);
		System.out.println("Employee Details Added Successfully");

	}

	public void viewEmployee() {
		
		Iterator i = emplist.iterator();		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}		
	}

	@Override
	public void sortEmployeeByName() {
	
		
	}
	@Override
	public void serializeEmp() 
	{
		try{
			FileOutputStream fos = new FileOutputStream("myfile210.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emplist);
			System.out.println("Serilized to file myfile210.txt");
			oos.close();
			fos.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}catch (IOException e) {
				e.printStackTrace();
	}
	@Override
	public void deserializeEmp() 
	{
		try{
			
			
			FileInputStream fis = new FileInputStream("myfile210.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee)ois.readObject();
			System.out.println("DeSerilized from file myfile210.txt");
			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			ois.close();
			fis.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
			catch(ClassNotFoundException cnf)
			{
				System.out.println("No Emp class");
			}	
	}
}
