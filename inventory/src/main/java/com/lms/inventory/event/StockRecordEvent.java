package com.lms.inventory.event;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity="com.lms.inventory.domain.StockRecordAggregate")
public interface StockRecordEvent extends Event {
}
