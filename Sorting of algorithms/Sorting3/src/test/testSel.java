package test;

	import java.util.Random;
	import java.util.Scanner;

	import javax.management.RuntimeErrorException;

	import Sorting3.Selection;
	import Sorting3.insertsrt;
	import Sorting3.bubblesrt;
	import Sorting3.mergesrt;
	import Sorting3.quicksrt;

	public class testSel {


		public static void main(String[] args) {
			
	 int []numArray;
	 
	 int size=0;
	 
	 Scanner scanner;
	 scanner=new Scanner(System.in);
	 System.out.println("Enter size of arraylist to be sorted: ");
	 size=scanner.nextInt();
	 System.out.println("Enter degree of sortedness in percentage: ");
	 int degreeSort=0;
	 degreeSort=scanner.nextInt();

	 scanner.close();
	 numArray= new int[size];
	 arraySize(size,numArray,degreeSort);

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
		
		
		
		
			
		
		
		public static int[] arraySize(int number,int[]array,int degreeSort){
			
			int dataSize=array.length;
			int sortedSize=degreeSort*(dataSize)/100;
			
			
			int value=2;
			for(int p=0;p<sortedSize;p++){
				array[p]=value++;
				
			}
			
			
			Random rng =new Random();
			for(int p=sortedSize;p<array.length;p++){
			int random = rng.nextInt(1000);
			array[p]=random;
			
		}
			System.out.println("unsorted data");
			for(int g=0;g<array.length;g++)
			System.out.print(array[g]+",");
			
			return array;
		}

	}