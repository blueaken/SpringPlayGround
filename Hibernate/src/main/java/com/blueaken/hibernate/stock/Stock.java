package com.blueaken.hibernate.stock;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: blueaken
 * Date: 12/8/14 1:47 下午
 */
public class Stock implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private StockDetail stockDetail;
    private Set<StockDailyRecord> stockDailyRecords = new HashSet<StockDailyRecord>(0);

    public Stock() {
    }

    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    public Set<StockDailyRecord> getStockDailyRecords() {
        return stockDailyRecords;
    }

    public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
        this.stockDailyRecords = stockDailyRecords;
    }
}