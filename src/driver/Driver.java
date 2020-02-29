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
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.lang.String;

/**
 *
 * @author elijahblake12
 */


public class Driver {

    public void writeTokens(String input_file, String output_file) throws IOException{      //writes tokens and types in an output file
        CharStream mirco_code = CharStreams.fromFileName(input_file);       //gets inout file as a charstream to be read with grammar
        Little lexer = new Little(mirco_code);      //uses lexer for purpose of grammar on the file
        FileWriter fileWriter = new FileWriter(output_file);        //initializes output writer
        PrintWriter printWriter = new PrintWriter(fileWriter);
    while(true) {       //while there is a next token in the input file
      Token token = lexer.nextToken();      //reads token with grammar file
      if(token.getType() == Little.EOF) {
        break;
      }
      String type = "";
        switch (token.getType()) {      //determines type of token that should be printed
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

      printWriter.printf("Token Type: " + type + "\n" + "Value: " + token.getText() + "\n");        //formatted print to output file
    
        
        
    }
    printWriter.close();
    
    }
    
    public void parseFile(String input_file) throws IOException{
        CharStream charStream = CharStreams.fromFileName(input_file);
        LittleLexer littleLexer = new LittleLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(littleLexer);
        LittleParser littleParser = new LittleParser(commonTokenStream);
        int errors = littleParser.getNumberOfSyntaxErrors();
        if(errors == 0){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Not Accepted");
        }
    }

    
    public static void main(String[] args) throws IOException{
        //instances of the writetokens method with given input files, and custom output files with tokens and values
        
        
        
        /*Driver driver = new Driver();
        driver.writeTokens("fibonacci.micro", "f.out");     
        driver.writeTokens("loop.micro", "l.out");
        driver.writeTokens("nested.micro", "n.out");
        driver.writeTokens("sqrt.micro", "s.out");*/
        
        
        Driver driver = new Driver();
        driver.parseFile("test1.micro");
        driver.parseFile("test2.micro");
        driver.parseFile("test3.micro");
        driver.parseFile("test4.micro");
        driver.parseFile("test5.micro");
        driver.parseFile("test6.micro");
        driver.parseFile("test7.micro");
        driver.parseFile("test8.micro");
        driver.parseFile("test9.micro");
        driver.parseFile("test10.micro");
        driver.parseFile("test11.micro");
        driver.parseFile("test12.micro");
        driver.parseFile("test13.micro");
        driver.parseFile("test14.micro");
        driver.parseFile("test15.micro");
        driver.parseFile("test16.micro");
        driver.parseFile("test17.micro");
        driver.parseFile("test18.micro");
        driver.parseFile("test19.micro");
        driver.parseFile("test20.micro");
        driver.parseFile("test21.micro");
        
        
        
    }
    
}
