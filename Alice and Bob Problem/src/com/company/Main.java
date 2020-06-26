package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void compare(List<Integer> a ,List<Integer> b){
        int[] arr = new int[2];
        int alice=0,bob=0;
        for(int i=0;i<3;i++)
           if(a.get(i)>b.get(i))
               alice++;
           else if(a.get(i)<b.get(i))
               bob++;
        arr[0] = alice;
        arr[1] = bob;
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        System.out.println("Enter Alice Array : ");
        for (int i=0; i < 3; i++)
            a.add(sc.nextInt());
        System.out.println("Enter Bob Array : ");
        for(int j=0;j<3;j++)
            b.add(sc.nextInt());
        compare(a,b);
    }
}
