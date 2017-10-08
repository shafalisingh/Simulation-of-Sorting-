
package test;

import java.util.Random;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import Sorting2.Selection;
import Sorting2.insertsrt;
import Sorting2.bubblesrt;
import Sorting2.mergesrt;
import Sorting2.quicksrt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.*;
public class testSel {

    public static void main(String args[]) {

        testSel obj = new testSel();

        List<Integer> elem=obj.readfromcsv();
        int[] numArray = new int[elem.size()];
        for (int i=0; i < numArray.length; i++)
        {
            numArray[i] = elem.get(i).intValue();
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





    public List<Integer> readfromcsv() {

        String csvFile = "/Users/tarun/Downloads/camera (1).csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = " ";
        List<Integer> myArrayList = new ArrayList<Integer>();
        int my_array1[] = new int[1000];
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {


                String[] money = line.split(cvsSplitBy);
                String mny[] = money[0].split(" ");

                for (String str : mny) {

                    myArrayList.add(Integer.parseInt(str));


                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return myArrayList;

    }
}

