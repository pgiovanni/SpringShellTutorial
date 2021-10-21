package com.mypackage.SpringShell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.*;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class SpringShell {

    public static void main(String[] args) {
        SpringApplication.run(SpringShell.class, args);
    }
}

