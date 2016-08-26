import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Michael Martinez
public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int arr[] = new int[n]; 
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            //insertion sort
                int prev = arr_i-1; // prev
                while(prev >= 0)
                {
                    if (arr[prev]>arr[prev+1])
                    {
                        int tmp = arr[prev];
                        arr[prev] = arr[prev+1];
                        arr[prev+1] = tmp;
                    } 
                    prev--;
                }
        }
        //Get the value of the front of the array and cut the others by that amount
        //Each time a stick is cut, increment a counter
        int temp = 1;
        int smallest = 0;
        while(temp!= 0)
        {
            int cutamount = arr[smallest];
            int counter = 0;
            for (int i = 0; i<arr.length; i++)
            {
                if (i==smallest && arr[i]==0)
                { 
                    smallest++; 
                    cutamount = arr[smallest]; //if prev smallest value is zero then go to next smallest.
                } 
                if (arr[i]!=0)
                {
                    arr[i] = arr[i] - cutamount;
                    counter++;
                }
            }
            temp = 0;
            for(int i = 0; i<arr.length;i++){
                temp += arr[i];
            } 
            System.out.println(counter); //print out the amount that were cut in a new line
        }
    }
}

//The following is the exact code I submitted for hackerrank
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int arr[] = new int[n]; 
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            //insertion sort
                int prev = arr_i-1; // prev
                while(prev >= 0)
                {
                    if (arr[prev]>arr[prev+1])
                    {
                        int tmp = arr[prev];
                        arr[prev] = arr[prev+1];
                        arr[prev+1] = tmp;
                    } 
                    prev--;
                }
        }
        //Get the value of the front of the array and cut the others by that amount
        //Each time a stick is cut, increment a counter
        int temp = 1;
        int smallest = 0;
        while(temp!= 0)
        {
            int cutamount = arr[smallest];
            int counter = 0;
            for (int i = 0; i<arr.length; i++)
            {
                if (i==smallest && arr[i]==0)
                { 
                    smallest++; 
                    cutamount = arr[smallest]; //if prev smallest value is zero then go to next smallest.
                } 
                if (arr[i]!=0)
                {
                    arr[i] = arr[i] - cutamount;
                    counter++;
                }
            }
            temp = 0;
            for(int i = 0; i<arr.length;i++){
                temp += arr[i];
            } 
            System.out.println(counter); //print out the amount that were cut in a new line
        }
    }
}

*/