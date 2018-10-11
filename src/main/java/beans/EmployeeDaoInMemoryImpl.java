package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	
	private Map<Integer,Employee> employeesMap = new HashMap<Integer,Employee>();
	{
		Employee employee1 = new Employee(1, "Alvaro", 55000);
		Employee employee2 = new Employee(2, "Reynaldo", 65000);
		
		employeesMap.put(employee1.getEmployeeID(), employee1);
		employeesMap.put(employee2.getEmployeeID(), employee2);
	}
	
	public void create(Employee employee) {
		employeesMap.put(employee.getEmployeeID(), employee);
	}
	
	public void update(Employee employee) {
		employeesMap.put(employee.getEmployeeID(), employee);
	}
	
	public void update(List<Employee> employees) {
		for(Employee employee: employees) {
			update(employee);
		}
	}
	
	public void delete(int employeeID) {
		employeesMap.remove(employeeID);
	}
	
	public Employee find(int employeeID) {
		return employeesMap.get(employeeID);
	}
	
	public List<Employee> find(List<Integer>employeeIDs){
		List<Employee> employees = new ArrayList<Employee>();
		for(Integer id:employeeIDs) {
			employees.add(employeesMap.get(id));
		}
		return employees;
	}
	
	public List<Employee> find(String name){
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(name.equals(employee.getName())) {
				employees.add(employee);
			}
			
		}
		return employees;
	}
	
	public List<Employee> find(boolean fullyVested){
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(fullyVested==(employee.isFullyVested())) {
				employees.add(employee);
			}
		}
		return employees;
	}
	
	
	
}
