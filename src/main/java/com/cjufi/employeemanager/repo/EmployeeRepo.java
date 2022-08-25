package com.cjufi.employeemanager.repo;

import com.cjufi.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
   // employeeRepo.deleteById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}