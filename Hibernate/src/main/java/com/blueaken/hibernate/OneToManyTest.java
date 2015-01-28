package com.blueaken.hibernate;

import com.blueaken.hibernate.stock.Stock;
import com.blueaken.hibernate.stock.StockDailyRecord;
import com.blueaken.hibernate.stock.StockDetail;
import com.blueaken.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Author: blueaken
 * Date: 12/8/14 2:02 下午
 */
public class OneToManyTest {

    public static void main( String[] args )
    {
        System.out.println("Hibernate one to many (XML Mapping)");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        session.save(stock);


        //1st record for 7052
        StockDailyRecord stockDailyRecord1 = new StockDailyRecord();
        stockDailyRecord1.setPriceOpen(new Float("1.2"));
        stockDailyRecord1.setPriceClose(new Float("1.1"));
        stockDailyRecord1.setPriceChange(new Float("10.0"));
        stockDailyRecord1.setVolume(3000000L);
        stockDailyRecord1.setDate(new Date());

        stockDailyRecord1.setStock(stock);
        stock.getStockDailyRecords().add(stockDailyRecord1);

        session.save(stockDailyRecord1);

        session.getTransaction().commit();
        System.out.println("Done");
    }

}
