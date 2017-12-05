package com.lms.inventory.rest;

import com.lms.common.model.ResourceWithUrl;
import com.lms.inventory.domain.StockRecordService;
import com.lms.inventory.model.StockRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.CompletableFuture;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
@RequestMapping(value = "/stock")
public interface InventoryResource {

    @RequestMapping(method = POST)
    public CompletableFuture<ResourceWithUrl> register(@RequestBody StockRecord stockRecord, HttpServletRequest request);

    @RequestMapping(value = "/{accessionNo}", method = DELETE)
    public CompletableFuture<ResourceWithUrl> deRegister(@RequestBody String accessionNo, HttpServletRequest request);

}
