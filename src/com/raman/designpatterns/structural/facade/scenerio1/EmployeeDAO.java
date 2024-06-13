package com.raman.designpatterns.structural.facade.scenerio1;

//Data Access Object which interacts with DB internally.
public class EmployeeDAO {
    public void insert() {

    }

    public void updateEmployeeNames() {

    }

    public Employee getEmployeeDetails(int empId) {
        return new Employee();
    }
    //other 100 methods
}
