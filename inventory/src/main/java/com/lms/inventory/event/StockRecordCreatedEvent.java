package com.lms.inventory.event;

import com.lms.inventory.model.StockRecord;

public class StockRecordCreatedEvent implements StockRecordEvent {

    private StockRecord stockRecord;

    public StockRecordCreatedEvent(StockRecord stockRecord) {
        this.stockRecord = stockRecord;
    }

    public StockRecord getStockRecord() {
        return stockRecord;
    }
}
