package mapperDto;

import java.util.List;
import java.util.stream.Collectors;

public class Facade {
    EmployeeService employeeService;
    EmployeeMapper employeeMapper;

    public Facade() {
        employeeMapper = new EmployeeMapper();
        employeeService = new EmployeeService();
    }

    List<EmployeeDto> getAllEmployee() {
        return employeeService.getAll().stream().map(employeeMapper::employeeDto).collect(Collectors.toList());
    }

}
