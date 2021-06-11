package com.nagarro.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.training.entity.Employee;

/**
 * Interface to perform CRUD operations on Employee.
 * @author manbhardwaj
 *
 */
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
