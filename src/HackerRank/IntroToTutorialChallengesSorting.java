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
public class IntroToTutorialChallengesSorting {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int s = in.nextInt();
        int arr[] = new int[s];
        int counter = 0;
        for (int i=0; i<arr.length;i++)
        {
            arr[i] = in.nextInt();
            if (arr[i] == v){counter = i;}
        }
        System.out.println(counter);
    }
}