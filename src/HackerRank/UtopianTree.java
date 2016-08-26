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
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int plant = 1;
            boolean spring = true;
            while(n!=0)
            {
                if (spring){plant=plant+plant; spring=false;}
                else{spring = true; plant+=1;}
                n--;
            }
            System.out.println(plant);
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
            int plant = 1;
            boolean spring = true;
            while(n!=0)
            {
                if (spring){plant=plant+plant; spring=false;}
                else{spring = true; plant+=1;}
                n--;
            }
            System.out.println(plant);
        }
    }
}

*/
