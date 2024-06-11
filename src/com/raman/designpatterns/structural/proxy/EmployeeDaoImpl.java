package com.raman.designpatterns.structural.proxy;

public class EmployeeDaoImpl implements EmployeeDAO {
    @Override
    public void create(String client, EmployeeDO obj) throws Exception {
        System.out.println("Created New Row in the Employee Table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employeeId " + employeeId);
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {
        System.out.println("Fetching Data from DB");
        return new EmployeeDO();
    }
}
