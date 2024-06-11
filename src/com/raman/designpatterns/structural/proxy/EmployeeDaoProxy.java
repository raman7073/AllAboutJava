package com.raman.designpatterns.structural.proxy;

public class EmployeeDaoProxy implements EmployeeDAO {
    EmployeeDAO employeeDAO;

    public EmployeeDaoProxy() {
        employeeDAO = new EmployeeDaoImpl();
    }

    @Override
    public void create(String client, EmployeeDO obj) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDAO.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {

            return employeeDAO.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
