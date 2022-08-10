package com.example.payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="paymenttbl")
public class Bank {
    @Id
    @GeneratedValue
    private int custID;
    private double Amount;
    private String transactionid;

}

