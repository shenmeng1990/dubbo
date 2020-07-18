package com.alibaba.service;

import com.alibaba.model.Employee;

/**
 * @Author shenmeng
 * @Date 2020/7/19
 **/
public interface EmployeeService {

    void addEmployee(Employee employee);

    Employee findEmployeeById(int id);

    Integer findEmployeeCount();

}
