package beans;

import java.util.Date;

public class Employee {
	private int employeeID;
	private String name;
	private double salary;
	private Date dateHire;
	private boolean fullyVested;
	
	public Employee() {
		
	}

	/**
	 * @param employeeID
	 * @param name
	 * @param salary
	 */
	public Employee(int employeeID, String name, double salary) {
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHire() {
		return dateHire;
	}

	public void setDateHire(Date dateHire) {
		this.dateHire = dateHire;
	}

	public boolean isFullyVested() {
		return fullyVested;
	}

	public void setFullyVested(boolean fullyVested) {
		this.fullyVested = fullyVested;
	}
	
	
	
}
