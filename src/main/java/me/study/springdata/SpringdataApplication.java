package me.study.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class SpringdataApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(SpringdataApplication.class, args);
    }

}
