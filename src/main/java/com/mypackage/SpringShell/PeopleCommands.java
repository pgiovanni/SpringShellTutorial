package com.mypackage.SpringShell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@ShellComponent
public class PeopleCommands {

    private final ConsoleService console;

    public PeopleCommands(ConsoleService console) {
        this.console = console;
    }

    @ShellMethod("interact with the directory")
    public void directory (
            @ShellOption (valueProvider = PersonValueProvider.class) Person person) {

        this.console.write("working with %s", person.getName());
    }
}
