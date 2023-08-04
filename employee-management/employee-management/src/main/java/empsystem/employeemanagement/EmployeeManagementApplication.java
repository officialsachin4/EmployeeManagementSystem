package empsystem.employeemanagement;

import empsystem.employeemanagement.model.Employee;
import empsystem.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee= new Employee();
//		employee.setFirstName("Sachin");
//		employee.setLastName("Sharma");
//		employee.setEmailId("Sachin@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1= new Employee();
//		employee1.setFirstName("Rahul");
//		employee1.setLastName("Sharma");
//		employee1.setEmailId("Rahul@gmail.com");
//		employeeRepository.save(employee1);
	}
}
