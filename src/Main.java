package src;

import src.command.CommandReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        authenticate();

        CommandReader.startReadCommand();
    }

    private static void authenticate() {
        Authentication authentication = new Authentication();
        authentication.authenticate();
    }
}
