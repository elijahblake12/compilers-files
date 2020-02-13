/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author elijahblake12
 */


public class Driver {

    public void writeTokens(String input_file, String output_file) throws IOException{
        CharStream fib = CharStreams.fromFileName(input_file);
        Little lexer = new Little(fib);
        FileWriter fileWriter = new FileWriter(output_file);
      PrintWriter printWriter = new PrintWriter(fileWriter);
    while(true) {
      Token token = lexer.nextToken();
      if(token.getType() == Little.EOF) {
        break;
      }
      String type = "";
        switch (token.getType()) { 
        case 1: 
            type = "WS"; 
            break; 
        case 2: 
            type = "FLOATLITERAL"; 
            break; 
        case 3: 
            type = "INTLITERAL"; 
            break; 
        case 4: 
            type = "COMMENT"; 
            break; 
        case 5: 
            type = "KEYWORD"; 
            break; 
        case 6: 
            type = "OPERATOR"; 
            break; 
        case 7: 
            type = "STRINGLITERAL"; 
            break; 
        case 8: 
            type = "IDENTIFIER"; 
            break; 
        } 
      //System.out.println("Token Type: " + type + "\n" + "Value: " + token.getText() + "\n");

      printWriter.printf("Token Type: " + type + "\n" + "Value: " + token.getText() + "\n");
    
        
        
    }
    printWriter.close();
    
    }

    
    public static void main(String[] args) throws IOException{
        Driver driver = new Driver();
        driver.writeTokens("fibonacci.micro", "f.out");
        driver.writeTokens("loop.micro", "l.out");
        driver.writeTokens("nested.micro", "n.out");
        driver.writeTokens("sqrt.micro", "s.out");
    }
    
}
