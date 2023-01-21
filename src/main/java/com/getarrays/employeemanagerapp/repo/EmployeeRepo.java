package com.getarrays.employeemanagerapp.repo;

import com.getarrays.employeemanagerapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
