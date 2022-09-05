package com.cydeo.service.impl;

import com.cydeo.model.Employee;
import com.cydeo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl extends CrudServiceImpl<Employee, Long> implements EmployeeService {
    @Override
    public Employee create(Employee object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Employee> createAll(List<Employee> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Employee object) {
        super.update(object.getId(), object);
    }

    @Override
    public List<Employee> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Employee object) {
        super.delete(object);

    }

    @Override
    public Employee readById(Long id) {
        return super.readById(id);
    }
}
