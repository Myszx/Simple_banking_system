package com.myszx.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_of_transaction")
    @NotNull
    private LocalDateTime transactionDate;

    @Column(name = "transaction_value")
    @NotNull
    private BigDecimal transactionValue;

    @Column(name = "from_account_number")
    @NotNull
    private long fromAccountNum;

    @Column(name = "to_account_number")
    @NotNull
    private long toAccountNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(BigDecimal transactionValue) {
        this.transactionValue = transactionValue;
    }

    public long getFromAccountNum() {
        return fromAccountNum;
    }

    public void setFromAccountNum(long fromAccountNum) {
        this.fromAccountNum = fromAccountNum;
    }

    public long getToAccountNum() {
        return toAccountNum;
    }

    public void setToAccountNum(long toAccountNum) {
        this.toAccountNum = toAccountNum;
    }
}
