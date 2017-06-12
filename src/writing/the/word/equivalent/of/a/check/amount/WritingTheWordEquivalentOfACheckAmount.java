/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writing.the.word.equivalent.of.a.check.amount;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class WritingTheWordEquivalentOfACheckAmount 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //get amount 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a dollar amount between 0.0 - 999.99: ");
        String amount = sc.next();
        
        //create DollarAmountInWord object to convert amount
        DollarAmountInWord dollarAmountInWord = new DollarAmountInWord(amount);
        
        String amountWord = dollarAmountInWord.getWord();
        
        System.out.printf("\nDollar amount in word: %s\n", amountWord);
    }
    
}
