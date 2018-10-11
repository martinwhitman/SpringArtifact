package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		EmployeeRecordService employeeRecordService = applicationContext.getBean("employeeRecordService",EmployeeRecordService.class);
		
		System.out.println("Before 10K across-the-board raise");
		System.out.println("Alvaro's salary: $"+employeeRecordService.getEmployee(1).getSalary());
		System.out.println("Reynaldo's salary: $"+employeeRecordService.getEmployee(2).getSalary());
		
		employeeRecordService.changeSalary(1, 65000);
		employeeRecordService.changeSalary(2, 75000);
		
		System.out.println("After 10K across-the-board raise");
		System.out.println("Alvaro's salary: $"+employeeRecordService.getEmployee(1).getSalary());
		System.out.println("Reynaldo's salary: $"+employeeRecordService.getEmployee(2).getSalary());
		
	}

}
