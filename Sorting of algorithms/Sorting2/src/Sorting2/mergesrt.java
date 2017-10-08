package Sorting2;



public class mergesrt {

	public  void mergesort(int[]list) {
		int[] tempArray= new int[list.length];
		mergesort(list,tempArray,0,list.length-1);
		
		for(int index=0;index<tempArray.length;index++)
		System.out.print(tempArray[index]+",");
	}
	private void mergesort(int[]list,int[]tempArray,int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			mergesort(list,tempArray,left,mid);
			mergesort(list,tempArray,mid+1,right);
			merge(list,tempArray,left,mid+1,right);
			
		}
			
	}
	private void merge(int[] list, int[] tempArray, int leftinit, int rightinit ,int rightlast) {
	int leftlast =rightinit-1;
	int	tempinit=leftinit;
	int numberele=rightlast-leftinit +1;
	while(leftinit<=leftlast&& rightinit<=rightlast)
		if(list[leftinit]<=list[rightinit]){
        
         tempArray[tempinit++]=list[leftinit++];
        }
		else
			tempArray[tempinit++]=list[rightinit++];
			
		
         while(leftinit<=leftlast)
        	 tempArray[tempinit++]=list[leftinit++];
         while(rightinit<=rightlast)
        	 tempArray[tempinit++]=list[rightinit++];
         for (int k=0;k<numberele; k++,rightlast--)
        	 list[rightlast]=tempArray[rightlast];

         
	}
}
	
