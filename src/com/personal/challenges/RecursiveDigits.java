package com.personal.challenges;

//https://edabit.com/challenge/ABgaWqqn2XDjBqwKy
//
//We define super digit of an integer x using the following rules:
//
//If x has only 1 digit, then its super digit is x.
//        Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
//        For example, the super digit of x will be calculated as:
//superDigit(9875)    9+8+7+5 = 29
//superDigit(29)      2 + 9 = 11
//superDigit(11)      1 + 1 = 2
//superDigit(2) = 2
//
//You are given two numbers n and k. The number p is created by concatenating the string n, k times. Continuing the above example where n = 9875, assume your value k=4. Your initial p = 9875 9875 9875 9875 (spaces added for clarity).
//
//superDigit(p) = superDigit(9875987598759875)
//  5+7+8+9+5+7+8+9+5+7+8+9+5+7+8+9 = 116
//
//superDigit(p) = superDigit(116)
//  1+1+6 = 8
//
//superDigit(p) = superDigit(8)
//All of the digits of p sum to 116. The digits of 116 sum to 8. 8 is only one digit, so it's the super digit.
//
//Complete the superDigit() method. It must return the calculated super digit as an integer.
//
//superDigit has the following parameter(s):
//
//n: a string representation of an integer.
//k: an integer, the times to concatenate n to make p.
//        Examples
//superDigit("148", 3) ➞ 3
//
//superDigit("123", 3) ➞ 9
//
//superDigit("99999999999999999999999999", 104500) ➞ 9
//Notes
//Each problem must be solved in less than 1 second.
public class RecursiveDigits {

    public static void main(String args[]){
        System.out.println("Resultado: " + superDigit("99999999999999999999999999", 104500));
    }

    public static Integer superDigit(String n, Integer k){
        if(n.length() == 1){
            return Integer.valueOf(n);
        }

        StringBuilder pString = new StringBuilder();
        pString.append(n.repeat(k));

        System.out.println("Valor de P: " + pString);

        Integer result = 0;

        for(int i=0; i<pString.length(); i++){
            result += Integer.parseInt(pString.substring(i, i+1));
        }

        return superDigit(String.valueOf(result), 1);
    }

}
