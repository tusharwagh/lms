package com.lms.inventory.command;

import com.lms.inventory.model.AccessionNo;
import com.lms.inventory.model.StockRecord;

public class CreateStockRecordCommand implements StockRecordCommand {

    private StockRecord stockRecord;
    private CreateStockRecordCommand(StockRecord stockRecord) {
        this.stockRecord = stockRecord;
    }

    public static CreateStockRecordCommand _instance(StockRecord stockRecord) {
        return new CreateStockRecordCommand(stockRecord);
    }

    public StockRecord getStockRecord() {
        return stockRecord;
    }
}
