package meserakov_misha.Task02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainTest {
private final Calc calc = new Calc();


private void menu() {
    String s = null;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    do {
        do {
            System.out.println("Enter command...");
            System.out.print("'q'uit, 'v'iew, 'g'enerate, 's'ave, 'r'estore, 'c'ount: ");
            try {
                s = in.readLine();
            } catch(IOException e) {
                System.out.println("Error: " + e);
                System.exit(0);
            }
        } while (s.length() != 1);
        switch (s.charAt(0)) {
            case 'q' -> System.out.println("Exit.");
            case 'v' -> {
                System.out.println("View current.");
                calc.show();
            }
            case 'g' -> {
                System.out.println("Random generation.");
                calc.init(Math.random() * 360.0);
                calc.show();
            }
            case 's' -> {
                System.out.println("Save current.");
                calc.save();
                calc.show();
            }

            case 'r' -> {
                System.out.println("Restore last saved.");
                try {
                    calc.restore();
                } catch (Exception e) {
                    System.out.println("Serialization error: " + e);
                }
                calc.show();
            }
            case 'c' -> {
                System.out.println("Count full notebooks.");
                int count = Integer.bitCount(calc.getCurrent()); // підрахунок кількості повних зошитів
                System.out.println("Number of full notebooks: " + count);
            }
            default -> System.out.print("Wrong command. ");
        }
    } while(s.charAt(0) != 'q');
}

}