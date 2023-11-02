module org.example {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.mybatis.spring;
    requires org.mybatis;
    requires java.sql;
    requires spring.context;
    requires spring.boot;
    requires org.mybatis.spring.boot.autoconfigure;
    requires liquibase.core;
    
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.jdbc;
    requires spring.tx;
    requires spring.core;
    requires com.google.gson;
    
    exports org.example.adapters.javafx.controller;
    // exports org.example.application.service;
}