package mapperDto;


import models.Employee;

import java.util.Date;

public class EmployeeMapper {

    EmployeeDto employeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setFullName(employee.getFirstName() + " " + employee.getLastName());
        Integer experince = findTwoDateBetweenYear(new Date(), employee.getRegistrationDate());
        employeeDto.setExperinceYear(experince);
        return employeeDto;
    }

    Integer findTwoDateBetweenYear(Date firstDate, Date secondDate) {
        long diff = firstDate.getTime() - secondDate.getTime();
        return (int) diff / (60 * 60 * 24 * 30) % 365;
    }

}
