package com.blueaken.springjms.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: blueaken
 * Date: 2/14/15 10:13 下午
 */
public class EmployeeTests {

    @Test
    public void testEmployee(){
        Employee employee = new Employee("Bruce", "Shen", "00001");

        assertEquals("Bruce", employee.getFirstName());
        assertEquals("Shen", employee.getLastName());
        assertEquals("00001", employee.getEmployeeId());
    }
}
