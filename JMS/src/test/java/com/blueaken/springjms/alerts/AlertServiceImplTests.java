package com.blueaken.springjms.alerts;

import com.bluekane.springjms.alerts.AlertServiceImpl;
import com.bluekane.springjms.domain.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: blueaken
 * Date: 2/14/15 10:19 下午
 */
public class AlertServiceImplTests {
    public AlertServiceImpl alertService = new AlertServiceImpl();

    @Test
    public void testAlertService(){

        Employee employee = new Employee("Bruce", "Shen", "00001");
        alertService.sendAlert(employee);

        Employee test = alertService.getAlert();
        assertEquals("Bruce", test.getFirstName());
        assertEquals("Shen", test.getLastName());
        assertEquals("00001", test.getEmployeeId());
    }
}
