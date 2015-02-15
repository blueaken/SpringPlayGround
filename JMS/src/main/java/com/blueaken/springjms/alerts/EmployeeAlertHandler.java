package com.blueaken.springjms.alerts;

import com.blueaken.springjms.domain.Employee;

/**
 * Author: blueaken
 * Date: 2/15/15 10:43 上午
 */
public class EmployeeAlertHandler {
    public void processSpittle(Employee employee) {
// ... implementation goes here...
        System.out.println("************************");
        System.out.println("Receiving new employee info:");
        System.out.println("New employee id: " + employee.getEmployeeId());
        System.out.println("New employee first name: " + employee.getFirstName());
        System.out.println("New employee last name: " + employee.getLastName());
    }
}
