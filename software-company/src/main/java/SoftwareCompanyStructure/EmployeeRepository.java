package SoftwareCompanyStructure;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    Employee findByFirstNameAndLastName(String firstName, String lastName);
    List<Employee> findByManagerId(Long managerId);
}

