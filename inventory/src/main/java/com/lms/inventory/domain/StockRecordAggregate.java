package com.lms.inventory.domain;

import com.lms.inventory.command.CreateStockRecordCommand;
import com.lms.inventory.command.StockRecordCommand;
import com.lms.inventory.event.StockRecordCreatedEvent;
import com.lms.inventory.model.StockRecord;
import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

/**
 * http://eventuate.io/docs/java/java-aggregates.html
 */

public class StockRecordAggregate extends ReflectiveMutableCommandProcessingAggregate<StockRecordAggregate, StockRecordCommand> {

    private StockRecord stockRecord;

    //For producing an event
    public List<Event> process(CreateStockRecordCommand cmd) {
        return EventUtil.events(new StockRecordCreatedEvent(cmd.getStockRecord()));
    }

    //For Consumption of the event
    public void apply(StockRecordCreatedEvent event) {
        this.stockRecord= event.getStockRecord();
    }
}
