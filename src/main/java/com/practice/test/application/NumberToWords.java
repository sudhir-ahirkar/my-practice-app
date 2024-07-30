package com.practice.test.application;

public class NumberToWords
{
    public void pw(int n, String ch)
    {
        String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
                " Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
                " Nineteen" };
 
        String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
        if (n > 19)
        {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        }
        else
        {
            System.out.print(" "+one[n]);
        }
        if (n > 0)
            System.out.print(ch);
    }
 
    public static void main(String[] args)
    {                                                                               }
}