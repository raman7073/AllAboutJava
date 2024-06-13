package com.raman.designpatterns.structural.facade.scenerio1;

import com.raman.designpatterns.structural.facade.scenerio1.Employee;
import com.raman.designpatterns.structural.facade.scenerio1.EmployeeDAO;

public class EmployeeFacade {
    EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    //client is only interested in these 2 methods
    public void insert() {
        employeeDAO.insert();
    }

    public Employee getEmployeeDetails(int empId) {
        return employeeDAO.getEmployeeDetails(empId);
    }
}
