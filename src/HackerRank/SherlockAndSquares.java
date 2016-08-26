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
public class SherlockAndSquares {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         for (int i = 0; i < t; i++)
         {
             int a = in.nextInt();
             int b = in.nextInt();
             int counter = 0;
             for(int x = 0; x <= Math.sqrt(b); x++)
             {
                 if (Math.pow(x, 2) >= a && Math.pow(x, 2) <= b)
                 {
                     counter++;
                 }
             }
             System.out.println(counter);
         }
    }
}

/* old shit
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         for (int i = 0; i < t; i++)
         {
             int a = in.nextInt();
             int b = in.nextInt();
             int counter = 0;
             for(int x = a; x <= b; x++)
             {
                 if (Math.ceil(Math.sqrt(x))-Math.floor(Math.sqrt(x)) == 0)
                 {
                     counter++;
                 }
             }
             System.out.println(counter);
         }
    }
}

*/

