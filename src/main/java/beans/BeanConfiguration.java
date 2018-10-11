package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public EmployeeRecordService employeeRecordService() {
		EmployeeRecordServiceImpl bean = new EmployeeRecordServiceImpl(employeeDao());
		//bean.setEmployeeDao(employeeDao());
		return bean;
	}
	
	@Bean
	public EmployeeDao employeeDaoJdbc() {
		EmployeeDaoJdbcImpl bean = new EmployeeDaoJdbcImpl();
		return bean;
	}
	
}
