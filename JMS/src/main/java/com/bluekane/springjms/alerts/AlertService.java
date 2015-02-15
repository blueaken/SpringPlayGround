package com.bluekane.springjms.alerts;

import com.bluekane.springjms.domain.Employee;

/**
 * Author: blueaken
 * Date: 2/14/15 5:52 下午
 */
public interface AlertService {
    public void sendAlert(Employee employee);
    public Employee getAlert();
}

