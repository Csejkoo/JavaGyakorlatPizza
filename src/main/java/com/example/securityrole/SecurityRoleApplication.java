package com.example.securityrole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SecurityRoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityRoleApplication.class, Arrays.toString(args));
    }

}
