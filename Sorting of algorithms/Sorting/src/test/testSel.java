package test;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import sorting.Selection;
import sorting.insertsrt;
import sorting.bubblesrt;
import sorting.mergesrt;
import sorting.quicksrt;

public class testSel {


   public static void main(String[] args) {
        Scanner scanner;
        scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();
        int[] numArray = new int[size];


        System.out.println("Enter the mean : ");
        int mean=scanner.nextInt();
        System.out.println("Enter the standard deviation: ");
        int std=scanner.nextInt();

     Random rng = new Random();
     for(int i = 0;i<numArray.length;i++) {
      numArray[i] = (Integer)Math.round((float) (mean + std * rng.nextGaussian()));

     }
 System.out.println("\nMerge sort starts...");


 mergesrt mrg=new mergesrt();
 long timestampBefore=System.currentTimeMillis();

 Runtime.getRuntime().gc();

 mrg.mergesort(numArray);

 long timestampAfter=System.currentTimeMillis();
 System.out.println("\nTime taken(in msec) :"+ (timestampAfter-timestampBefore));
 System.out.println("\n Memory used :"+( Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

System.out.println("\nQuick sort starts...");

 Runtime.getRuntime().gc();

 quicksrt qui=new quicksrt();

 timestampBefore=System.currentTimeMillis();
 qui.sortArray(numArray,0,numArray.length-1);

 timestampAfter=System.currentTimeMillis();
 System.out.println("\nTime taken(in msec) :"+ (timestampAfter-timestampBefore));
 System.out.println("\n Memory used :"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

System.out.println("\nInsert sort starts...");
 Runtime.getRuntime().gc();
 insertsrt ins=new insertsrt();
 timestampBefore=System.currentTimeMillis();
 ins.sort(numArray);

 timestampAfter=System.currentTimeMillis();
 System.out.println("\nTime taken(in msec) :"+ (timestampAfter-timestampBefore));
 System.out.println("\n Memory used :"+( Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

 System.out.println("\nBubble sort starts...");
 Runtime.getRuntime().gc();
bubblesrt bub=new bubblesrt();
timestampBefore=System.currentTimeMillis();
bub.bubblesort(numArray);
timestampAfter=System.currentTimeMillis();
System.out.println("\nTime taken(in msec) :"+ (timestampAfter-timestampBefore));
System.out.println("\n Memory used :"+( Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));

 System.out.println("\nSelection sort starts...");
Runtime.getRuntime().gc();
Selection sel= new Selection();
timestampBefore=System.currentTimeMillis();
sel.SelectionSort(numArray);
timestampAfter=System.currentTimeMillis();
System.out.println("\nTime taken(in msec) :"+ (timestampAfter-timestampBefore));
System.out.println("\n Memory used :"+( Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));


   }



}