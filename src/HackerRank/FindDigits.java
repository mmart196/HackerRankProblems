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
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int counter = 0;
            String ns = n+"";
            for (int i = 0; i < ns.length(); i++)
            {
                int digit = Integer.parseInt(ns.substring(i, i+1));
                if (digit==0){}
                else if (n%digit == 0){counter++;}
            }
            System.out.println(counter);
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
            int counter = 0;
            String ns = n+"";
            for (int i = 0; i < ns.length(); i++)
            {
                int digit = Integer.parseInt(ns.substring(i, i+1));
                if (digit==0){}
                else if (n%digit == 0){counter++;}
            }
            System.out.println(counter);
        }
    }
}

*/
