import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int VALID_PIN  = 1234;
        int scannedPin = 0;
        String pin = "";

        System.out.println("PLEASE, ENTER YOUR PIN");
        pin += (char)System.in.read();
        pin += (char)System.in.read();
        pin += (char)System.in.read();
        pin += (char)System.in.read();
        scannedPin = Integer.parseInt(pin);

        System.out.println(pin);
        System.out.println("Account accessible? " + (VALID_PIN == scannedPin));


    }
}
