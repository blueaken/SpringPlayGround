package com.blueaken.springjms.alerts;

import com.blueaken.springjms.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Author: blueaken
 * Date: 2/14/15 10:19 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-spring.xml"})
public class AlertServiceImplTests {
    public AlertServiceImpl alertService = new AlertServiceImpl();

    @Autowired
    Employee employee;

    @Test
    public void testAlertService(){

        //use spring IOC instead of instantiate Employee object with new keyword
//        Employee employee = new Employee("Bruce", "Shen", "00001");

        //asynchronous call test
       alertService.sendAlert(employee);

        //synchronous call test
        // - need to remove the jms-listener spring config to make it work
        // - or add a new jms destination for synchronous call only
//        alertService.sendAlert(employee);
//        Employee test = alertService.getAlert();
//        assertEquals("Bruce", test.getFirstName());
//        assertEquals("Shen", test.getLastName());
//        assertEquals("00001", test.getEmployeeId());
    }
}
