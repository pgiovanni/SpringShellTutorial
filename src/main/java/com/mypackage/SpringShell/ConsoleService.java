package com.mypackage.SpringShell;

import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class ConsoleService {

    private final static String ANSI_YELLOW = "\u001b[33m";
    private final static String ANSI_RESET = "\u001b[0m";

    private final PrintStream out = System.out;

    public void write(String msg, String ... args) {

        this.out.print(">");
        this.out.print(ANSI_YELLOW);
        this.out.printf(msg, (Object[]) args);
        this.out.print(ANSI_RESET);
        this.out.println();

    }
}

