/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MFIReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader {
    private static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }
    
    public static String readString(String message) throws IOException{
        System.out.println("Enter "+ message+": ");
        return getReader().readLine();
    }
    
    public static String readChar(String message) throws IOException{
        System.out.println(message+": ");
        return getReader().readLine();
    }
    
    public static int readInt(String message) throws IOException{
        return Integer.parseInt(readString(message));
    }
    
    public static double readDouble(String message) throws IOException{
        return Double.parseDouble(readString(message));
    }
    
}
