package com.lms.inventory;

import com.lms.inventory.command.StockRecordCommand;
import com.lms.inventory.domain.StockRecordAggregate;
import com.lms.inventory.model.StockRecord;
import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.request.RequestContextListener;

@org.springframework.context.annotation.Configuration
@EntityScan("com.lms")
@EnableAutoConfiguration
public class Configuration {

    @Bean
    public AggregateRepository<StockRecordAggregate,StockRecordCommand> aggregateRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(StockRecordAggregate.class, eventStore);
    }

    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(additional);
    }

    @Bean
    public ServletListenerRegistrationBean<RequestContextListener> httpRequestContextListener() {
        return new ServletListenerRegistrationBean<RequestContextListener>(new RequestContextListener());
    }
}
