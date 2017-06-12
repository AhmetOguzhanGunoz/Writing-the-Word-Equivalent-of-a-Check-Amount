/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writing.the.word.equivalent.of.a.check.amount;

import java.util.StringTokenizer;

/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class DollarAmountInWord 
{
    private static final String[] ones = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    private static final String[] teens = {"TEN"," ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTTEEN","NINETEEN"};
    private static final String[] tens = {"" ,"TEN","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY", "EIGHTY","NINETY"};
    
    private StringTokenizer money;
    private String amountInWord = "";
    
    public DollarAmountInWord(String number)
    {
        int Dollar = getDollars(number);
        int Change = getChange();
        
        //if there is a hundreds component
        if(Dollar >= 100)
        {
            amountInWord += dollarInString(Dollar/100) + " hundred ";
        }
        
        //output the rest of the dollars
        amountInWord += dollarInString(Dollar % 100) + " and " ;
        
        amountInWord += "" + changeInString(Change);
    }
    
    public String getWord()
    {
        return amountInWord;
    }
    
    private String changeInString(int change)
    {
        return change + "/100";
    }
    
    private String dollarInString(int dollar)
    {
        //if there is less than ten dollars
        if(dollar == 0)
            return "ZERO";        
        else if(dollar < 10)
            return ones[dollar];
        else if (dollar < 20)
            return teens[dollar - 10];
        else //if the amount is more than 20
            //create the amount with tens and the ones array
            return tens[dollar / 10] + ones[dollar % 10];
    }
    
    private int getDollars(String amount)
    {
        money = new StringTokenizer(amount,".");
        
        return Integer.parseInt(money.nextToken());
    }
    
    private int getChange()
    {
        if(money.hasMoreTokens())
        {
            return Integer.parseInt(money.nextToken());
        }
        else
        {
            return 0;
        }
        
    }
}
