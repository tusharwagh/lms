package com.lms.inventory.domain;

import com.lms.inventory.command.CreateStockRecordCommand;
import com.lms.inventory.command.StockRecordCommand;
import com.lms.inventory.model.StockRecord;
import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;

import java.util.concurrent.CompletableFuture;

public class StockRecordService {

    private final AggregateRepository<StockRecordAggregate,StockRecordCommand> stockRecordRepository;

    public StockRecordService(AggregateRepository<StockRecordAggregate,StockRecordCommand> stockRecordRepository) {
        this.stockRecordRepository = stockRecordRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<StockRecordAggregate>> registerStock(StockRecord stockRecord) {
        return stockRecordRepository.save(CreateStockRecordCommand._instance(stockRecord));
    }

}
