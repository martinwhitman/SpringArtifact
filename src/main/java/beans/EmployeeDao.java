package beans;

import java.util.List;

public interface EmployeeDao {

	public void create(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(int employeeID);
	public Employee find(int employeeID);
	public List<Employee> find(List<Integer>employeeIDs);
	public List<Employee> find(String name);
	public List<Employee> find(boolean fullyVested);
	
}
