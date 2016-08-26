package HackerRank;

import java.util.Scanner;

public class AngryProfessor {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int counter = 0;
            int n = in.nextInt(); //Students in class
            int k = in.nextInt(); //Cancellation Threshold
            int a[] = new int[n]; //List of arrival times
            for(int i=0; i < n; i++)
            {
                a[i] = in.nextInt();
                if (a[i]<=0)
                {
                    counter++;
                }
            }
            if (counter>=k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");   
            }
        }
    }
}
    


/* this is the one i sent to hacker rank!
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
            int counter = 0;
            int n = in.nextInt(); //Students in class
            int k = in.nextInt(); //Cancellation Threshold
            int a[] = new int[n]; //List of arrival times
            for(int i=0; i < n; i++)
            {
                a[i] = in.nextInt();
                if (a[i]<=0)
                {
                    counter++;
                }
            }
            if (counter>=k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");   
            }
        }
    }
}

*/
