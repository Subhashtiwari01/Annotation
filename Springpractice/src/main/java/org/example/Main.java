package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.swing.*;



@SpringBootApplication
public class Main {
    @Autowired
    public  Student student;

    public void info(){
        student.learning();

    }





    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);









    }
}