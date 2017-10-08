package sorting;

public class bubblesrt {


	public static void bubblesort(int[]S){
		for(int i=0;i<S.length;i++){
			for(int j=0;j<S.length-1-i;j++){
				if(S[j]>S[j+1])
				{int temp=S[j+1];
				S[j+1]=S[j];
				S[j]=  temp;
			}
		}
	
	
            
		}
   
		 for(int p=0;p<S.length;p++)
				System.out.print(S[p]+",");
		   

		 }
	}
	

