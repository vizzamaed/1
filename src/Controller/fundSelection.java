package Controller;

import MFIReader.Reader;
import java.io.IOException;

/**
 *
 * @author vizzamaed
 */
public class fundSelection { 
    public static double navps;  

    public static String getFundSelection() throws IOException {
        while (true) {
            System.out.println("Choose Investment Fund Type:");
            System.out.println("A: SALEF");
            System.out.println("B: SALBF");
            System.out.println("C: SALFIF");
            String choice = Reader.readString("Your choice (A/B/C)").trim().toUpperCase();

            switch (choice) {
                case "A":
                    navps = 4.6125;
                    return "Save and Learn Equity Fund";
                case "B":
                    navps = 2.4908;
                    return "Save and Learn Balanced Fund";
                case "C":
                    navps = 2.4461;
                    return "Save and Learn Fixed Income Fund";
                default:
                    System.err.println("Invalid choice. Please select A, B, or C.");
            }
        }
    }
}
