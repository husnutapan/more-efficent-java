package mapperDto;

import models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService extends EmployeeAbst {

    @Override
    List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<Employee>() {{
            add(new Employee("Husnu", "Tapan", Boolean.FALSE));
            add(new Employee("Husnu1", "Tapan1", Boolean.FALSE));
            add(new Employee("Husnu2", "Tapan2", Boolean.FALSE));
            add(new Employee("Husnu3", "Tapan3", Boolean.FALSE));
        }};
        return employeeList;
    }
}
