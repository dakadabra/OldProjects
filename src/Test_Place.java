//import java.io.File;
//import java.io.FileWriter;
//import java.io.BufferedWriter;
//import java.io.IOException;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.Console;
public class Test_Place {

public void passwordExample() {        
    Console console = System.console();
    if (console == null) {
        System.out.println("Couldn't get Console instance");
        System.exit(0);
    }

    console.printf("Testing password%n");
    char passwordArray[] = console.readPassword("Enter your secret password: ");
    console.printf("Password entered was: %s%n", new String(passwordArray));

}

public static void main(String[] args) {
    new Test_Place().passwordExample();
}
}