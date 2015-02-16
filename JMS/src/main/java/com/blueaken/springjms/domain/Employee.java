package com.blueaken.springjms.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Author: blueaken
 * Date: 2/14/15 5:50 下午
 */
@Component
public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee() {
        this.firstName = "Bruce";
        this.lastName = "Shen";
        this.employeeId = "00002";
    }

    public Employee(String firstName, String lastName, String employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
