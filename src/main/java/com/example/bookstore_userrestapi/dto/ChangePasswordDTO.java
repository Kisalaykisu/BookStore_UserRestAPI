package com.example.bookstore_userrestapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChangePasswordDTO {
    private String emailAddress;
    private String oldPassword;
    private String password;
}
