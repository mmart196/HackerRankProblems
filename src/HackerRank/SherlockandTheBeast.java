/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class SherlockandTheBeast {
    /*
    Decent Number:
    1. Its digits can only be 3's and/or 5's.
    2. The number of 3's it contains is divisible by 5.
    3. The number of 5's it contains is divisible by 3.
    4. If there are more than one such number, we pick the largest one.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int test = n; 
            int times = 0;
            while(test%3 != 0 && test>2)
            {
             test-=5;
             times++;
            }
            if (n<3) //If n is less than 3 it will not be a Decent Number
            {
               System.out.print("-1");
               System.out.println("");
            }
            else if (test%3 == 0) //If it has multiples of 3 from the test loop it is a decent number
            {
               for(int i = 0; i<test; i++)
               {
                System.out.print("5");
               }
               for(int i = 0; i<times*5; i++)
               {
                System.out.print("3");
               }
               System.out.println("");
            }
            else if (n%3 == 0) //If divisible by 3 then it is a Decent Number
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("5");
                }
                System.out.println("");
            }
            else if (n%5 == 0) //If divisible by 5 then it is a decent Number
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("3");
                }
                System.out.println("");
            }
            else
            {
                System.out.print("-1"); 
                System.out.println("");
            }
        }
    }
}

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int test = n; 
            int times = 0;
            while(test%3 != 0 && test>2)
            {
             test-=5;
             times++;
            }
            if (n<3) //If n is less than 3 it will not be a Decent Number
            {
               System.out.print("-1");
               System.out.println("");
            }
            else if (test%3 == 0) //If it has multiples of 3 from the test loop it is a decent number
            {
               for(int i = 0; i<test; i++)
               {
                System.out.print("5");
               }
               for(int i = 0; i<times*5; i++)
               {
                System.out.print("3");
               }
               System.out.println("");
            }
            else if (n%3 == 0) //If divisible by 3 then it is a Decent Number
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("5");
                }
                System.out.println("");
            }
            else if (n%5 == 0) //If divisible by 5 then it is a decent Number
            {
                for(int i = 0; i<n; i++)
                {
                    System.out.print("3");
                }
                System.out.println("");
            }
            else
            {
                System.out.print("-1"); 
                System.out.println("");
            }
        }
    }
}
*/
