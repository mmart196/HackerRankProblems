/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.Scanner;

/*
Figures out what type of vehicle will fight in a service lane based on 
following parameters: Length of freeway: n, Number of test cases: t, Width of
the segment: width[k], segment enter: i, segment exit: j.
Vehicles that can pass: 1 Bike, 2 Car, 3 Truck.
ex: if 1 is outputed that means only a bike can service.
ex2: if 3 is outputed that means bike, car, or a truck can service.
*/
public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //Length of array
        int t = in.nextInt(); //Number of test cases
        int width[] = new int[n]; 
        int smallest = 0;
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++)
        {
            int i = in.nextInt();
            int j = in.nextInt();
            smallest = width[i];
            for(int x = i; x <= j; x++)
            {
                if (smallest>width[x])
                {
                    smallest = width[x];
                }
            }
            System.out.println(smallest);
        }
        
    }
}
