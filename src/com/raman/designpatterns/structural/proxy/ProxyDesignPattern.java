package com.raman.designpatterns.structural.proxy;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDaoProxy();
            employeeDAO.create("ADMIN", new EmployeeDO());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
