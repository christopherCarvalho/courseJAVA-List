package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Staff;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		List<Staff> list = new ArrayList();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{	
			System.out.println();
			System.out.println("Enter employee #"+(i+1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.next();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			
			Staff staff = new Staff(id, name, salary);
			
			list.add(staff);
		}
		
		
		System.out.print("\nEnter the employee ID will be increase salary: ");
		Integer idSalary = sc.nextInt();
		Staff staff = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); 
		if (staff == null) 
		{
			System.out.print("\nThe id does not exist!");
		}
		else 
		{
			System.out.print("\nEnter the percentage: ");
			Double percentage = sc.nextDouble();
			staff.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Staff employee : list)
		{			
			System.out.println(employee);
		}
		
		sc.close();
	}

}
