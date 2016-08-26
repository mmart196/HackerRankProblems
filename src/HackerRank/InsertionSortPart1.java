package HackerRank;

import java.util.Scanner;


public class InsertionSortPart1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int ar[] = new int[in.nextInt()];
            for(int i=0; i<ar.length; i++)
            {
                ar[i] = in.nextInt();
            }
            
            
            int x = (ar.length-1);
            int gg = ar[x];
            while(x!=0 && ar[x]<ar[x-1])
                {
                    for(int c = 0; c<ar.length; c++)
                    {
                        if (ar[c] != gg)
                        {
                            System.out.print(""+ar[c]+" ");
                        }
                        else
                        {
                            System.out.print(""+ar[c-1]+" ");
                        }
                    }
                    System.out.println("");
                    int tmp = ar[x-1];
                    ar[x-1] = ar[x];
                    ar[x] = tmp;
                    if (x != 0) {x-=1;}
                }
                for(int c = 0; c<ar.length; c++)
                    {
                        System.out.print(""+ar[c]+" ");
                    } 
    }
    
    
}
