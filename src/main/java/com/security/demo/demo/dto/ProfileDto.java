package com.security.demo.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
    private int accountNumber;
    private String email;
    private String address;
    private String userName;
    private String name;
    private Date DateOfBirth;
    private double balance;
    private String accountType;
    private String mobileNumber;
}
