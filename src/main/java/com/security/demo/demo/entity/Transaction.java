package com.security.demo.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    private long transactionId;

    @ManyToOne
    @JoinColumn(name = "accountNumber")
    private Account account;

    private String transactionType;

    private double amount;

    private Date transactionDate;
}
