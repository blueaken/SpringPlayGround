package com.blueaken.hibernate;

import com.blueaken.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Author: blueaken
 * Date: 12/8/14 2:02 下午
 */
public class Test {

    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("4715");
        stock.setStockName("GENM");

        session.save(stock);
        session.getTransaction().commit();
    }

}
