package com.raman.designpatterns.structural.facade.scenerio1;

public class EmployeeClient {
    public void getEmployeeDetails() {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employee = employeeFacade.getEmployeeDetails(122);
    }
}
