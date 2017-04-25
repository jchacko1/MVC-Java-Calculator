/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacalculator;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class modelJavaCalculator {
    
    
    
   public String Calculate(String equation){
       String calculation;
       
       String tokens[];
       
       Stack stack_equation = new Stack();
       
       Double left, right, result;
       
       
       tokens = equation.split(" ");
       
       for(int i = 0; i < tokens.length; i++){
           //next_token = token_equation.nextToken();
           
           if(String.valueOf(tokens[i]).equals("+") || String.valueOf(tokens[i]).equals("-")){
               stack_equation.add(tokens[i]);
           }
           else if(String.valueOf(tokens[i]).equals("*")){
               left = Double.valueOf(stack_equation.pop().toString());
               right = Double.valueOf(tokens[i+1]);
               result = left * right;
               stack_equation.add(result.toString());
               i++;
               
           }
           else if(String.valueOf(tokens[i]).equals("/")){
               left = Double.valueOf(stack_equation.pop().toString());
               right = Double.valueOf(tokens[i+1]);
               result = left / right;
               stack_equation.add(result.toString());
               i++;
               
           }
           else{
               stack_equation.add(tokens[i]);
            }
           
           
       }
       
       while(stack_equation.size() != 1){
           right = Double.valueOf(stack_equation.pop().toString());
           
           if(stack_equation.pop().toString().equals("+")){
               left = Double.valueOf(stack_equation.pop().toString());
               result = left + right;
               stack_equation.add(result.toString());
           }
           else{
               left = Double.valueOf(stack_equation.pop().toString());
               result = left - right;
               stack_equation.add(result.toString());
           }
           
       }
       
       
       calculation = String.valueOf(stack_equation.pop());
       
       //System.out.println(equation);
       return calculation;
   }
    
    
   
   
   
    
    
}
