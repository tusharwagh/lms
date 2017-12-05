package com.lms.inventory.entity;

import com.lms.inventory.model.AccessionNo;
import com.lms.inventory.model.Status;
import com.lms.inventory.model.StockRecord;

import javax.persistence.*;
import java.awt.print.Book;

@Entity
public class StockRecordEntity {

    @Id
    private String accessionNo;
    @Column(nullable = false)
    private String isbn;
    @Column
    private String status;

    public StockRecordEntity(StockRecord stockRecord) {
        this.accessionNo = stockRecord.getAccessionNo().getAccessionNo();
        this.isbn = stockRecord.getBook().getIsbn().getIsbnNumber();
        this.status = stockRecord.getStatus().name();
    }

    public String getAccessionNo() {
        return accessionNo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "StockRecordEntity{" +
                "accessionNo='" + accessionNo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
