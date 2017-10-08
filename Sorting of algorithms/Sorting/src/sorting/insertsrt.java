package sorting;

public class insertsrt {


	 public static void sort(int[]S){
		   for(int i=1;i<S.length;i++){
			   int key=S[i];
			   int j=i-1;
			   while(j>=0&&S[j]>key){
				   S[j+1]=S[j];
				   j--;
			   }
		    S[j+1]=key;
		   }
		   for(int p=0;p<S.length;p++)
				System.out.print(S[p]+",");
		   
		   
	   }
}

