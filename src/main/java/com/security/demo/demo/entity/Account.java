package com.security.demo.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int accountNumber;

    private String accountType;

    private double balance;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private UserInfo user;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

}
