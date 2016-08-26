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
public class InsertionSortPart2 {
    public static void insertionSortPart2(int[] ar)
    {   
        int ar2[] = new int[ar.length];
        for(int i = 0; i<ar2.length; i++)
        {
            ar2[i] = ar[i];
            if (i != 0)
            {
             int x = i;
             while (x!=0 && ar2[x]<ar2[x-1])
             {
                 int tmp = ar2[x-1];
                 ar2[x-1] = ar2[x];
                 ar2[x] = tmp;
                 if (x != 0) {x-=1;}
             }
            
            for (int i2 = i+1; i2<ar2.length; i2++)
            {
               ar2[i2]=ar[i2]; 
            }
            printArray(ar2);
            }
        }
        ar=ar2;
    }
    
    
      
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}


