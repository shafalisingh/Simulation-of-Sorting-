package Sorting2;


public class quicksrt {


	public void sortArray(int[]arr,int left, int right){
		
		quicksort(arr,left,right);
		
		for(int index=0;index<arr.length;index++)
			System.out.print(arr[index]+",");
	}
	 public static void quicksort(int[]arr,int left, int right){
		 int index = division(arr,left,right);
		 if(left<index-1)
			 quicksort(arr,left,index-1);
		 if(index<right)
			 quicksort(arr,index,right);
		 	 
	 }





private static int division(int[] arr, int left, int right) {
	
	  int center= arr[(left+right)/2];
	  while(left<=right){
		  while(arr[left]<center)left++;
		  while(arr[right]>center)right--;
		  
		  if(left<=right){
			  int temp=arr[left];
			  arr[left]=arr[right];
			  arr[right]=temp;
			  left++;
			  right--;
			  
		  }
	  }
	  return left;
}


}

