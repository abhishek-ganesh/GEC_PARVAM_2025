package EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EmployeeCRUD.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByEmail(String email);
}




