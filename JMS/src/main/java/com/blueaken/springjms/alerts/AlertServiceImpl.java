package com.blueaken.springjms.alerts;

import com.blueaken.springjms.domain.Employee;
import org.apache.activemq.command.ActiveMQDestination;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.JmsUtils;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

/**
 * Author: blueaken
 * Date: 2/14/15 6:09 下午
 */

//@Component
    /*
     参考：《Spring in Action》Chap 12 and
     - https://dimitrisli.wordpress.com/2010/12/15/spring-activemq-maven-example/
     */
public class AlertServiceImpl implements AlertService{

    ApplicationContext context = new ClassPathXmlApplicationContext(
            "spring.xml");

    JmsTemplate jmsTemplate = (JmsTemplate) context.getBean("jmsTemplate");
    ActiveMQDestination destination = (ActiveMQDestination) context.getBean("queue");


    public void sendAlert(final Employee employee){
        jmsTemplate.send(
                destination,
            new MessageCreator() {
                public Message createMessage(Session session) throws JMSException {
                    return session.createObjectMessage(employee);
                }
            }
        );
    }

    public Employee getAlert(){
        try {
            ObjectMessage receivedMessage =
                    (ObjectMessage) jmsTemplate.receive();
            return (Employee) receivedMessage.getObject();
        } catch (JMSException jmsException) {
            throw JmsUtils.convertJmsAccessException(jmsException);
        }
    }
}
