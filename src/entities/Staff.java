package entities;

public class Staff {
	private Integer id;
	private String name;
	private Double salary;
	
	public Staff(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	public double increaseSalary(double percentage)
	{
		 return salary += getSalary() * percentage/100.0;
	}

	
	public String toString() {
		return  id + ", " + name + ", " + String.format("%.2f",salary);
	}
	
	
	
	
}
