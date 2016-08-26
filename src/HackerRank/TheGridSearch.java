/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class TheGridSearch {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TheGridSearchInput3.txt");
        Scanner in = new Scanner(file);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            int counter = 1; //starts at 1 bec i only check after the 1st line
            boolean done = false; //Determines when we are done to save time
            //int x = 0; // Integer for P rows
            //Go Through each row of G
            for(int i=0; i<G.length;i++)
            {
                for(int y=0; y<G[i].length();y++)
                {
                  //System.out.println("G: "+ G[i].toString());
                   //Search for substring of column length of P
                   //increase the substring startindex and endindex by one until endindex is out of bounds
                   //Then, go to next line.
                   //if remaining rows is less than P then stop. It is no.
                   //if the line for p is not found then go back in p and the last part before moving down in G.
                   //Once the first line is found for P, check next line for P, and move down a row in G.  
                   if(!done && y+P[0].length()<=G[i].length())
                   {
                      //System.out.println("P[x]= "+ P[x]);
                        String GRow = G[i].substring(y, y+P[0].length());
                        //System.out.println("Before if= "+ GRow);
                        if (GRow.compareTo(P[0]) == 0)
                        {
                            //System.out.println("Before inside while= "+ GRow);
                            boolean check = true;
                            int inc = 1; //to increment G
                            int x = 0; //to increment P
                            
                            while(counter!=r && check && x+1<=P.length-1)
                            {
                                x++; //Check the next since first was a match
                                //System.out.println("inside");
                                String fRow = G[i+inc].substring(y, y+P[x].length());
                               // System.out.println("After= "+ fRow );
                                //System.out.println("P[x]= "+ P[xinc]);
                                if (fRow.compareTo(P[x]) == 0)
                                {
                                    ///System.out.println("yay");
                                    counter++;
                                   // System.out.println("counter " +counter);
                                    //System.out.println("r=" + r);
                                    inc++; //Row of G
                                    done = true;
                                }
                                else
                                {
                                    done = false;
                                    check = false;
                                    counter = 1;
                                }
                            }
                            //Skip rest of letters and go down a row.
                            //String fRow = G[i+1].substring(y, y+P[x].length());
                            //System.out.println("Next= "+ fRow);
                        }   
                   }
                   else
                   {
                       y=G[i].length();
                   }
                }
                if(done){ i=G.length;}
            }
            if(done){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}

/*
int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            int counter = 1;
            boolean done = false;
            int x = 0; // Integer for P rows
            //Go Through each row of G
            for(int i=0; i<G.length;i++)
            {
                for(int y=0; y<G[i].length();y++)
                {
                   if(!done && y+P[x].length()<=G[i].length())
                   {
                        String GRow = G[i].substring(y, y+P[x].length());
                        if (GRow.compareTo(P[x]) == 0)
                        {
                            boolean check = true;
                            int inc = 1;
                            int xinc = x;
                            
                            while(counter!=r && check && xinc+1<=P.length-1)
                            {
                                xinc++; //Row of P
                                String fRow = G[i+inc].substring(y, y+P[xinc].length());
                                if (fRow.compareTo(P[xinc]) == 0)
                                {
                                    counter++;
                                    inc++; //Row of G
                                    done = true;
                                }
                                else
                                {
                                    done = false;
                                    check = false;
                                    counter = 1;
                                    xinc=x;
                                    
                                }
                                
                            }
                           
                        }   
                   }
                }
                
            }
            if(done){System.out.println("YES");}
            else{System.out.println("NO");}
            done = false;
        }
    }
}

*/

/*
IMPROVED:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            
            int counter = 1; //starts at 1 bec i only check after the 1st line
            boolean done = false; //Determines when we are done to save time
            for(int i=0; i<G.length;i++)
            {
                for(int y=0; y<G[i].length();y++)
                {
                   if(!done && y+P[0].length()<=G[i].length())
                   {
                        String GRow = G[i].substring(y, y+P[0].length());
                        if (GRow.compareTo(P[0]) == 0)
                        {
                            boolean check = true;
                            int inc = 1; //to increment G
                            int x = 0; //to increment P
                            
                            while(counter!=r && check && x+1<=P.length-1)
                            {
                                x++; //Check the next since first was a match
                                String fRow = G[i+inc].substring(y, y+P[x].length());
                                if (fRow.compareTo(P[x]) == 0)
                                {
                                    counter++;
                                    inc++;
                                    done = true;
                                }
                                else
                                {
                                    done = false;
                                    check = false;
                                    counter = 1;
                                }
                            }
                        }   
                   }
                   else
                   {
                       y=G[i].length();
                   }
                }
                if(done){ i=G.length;}
            }
            if(done){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
*/