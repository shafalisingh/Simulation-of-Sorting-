package Sorting4;


public class Selection {
	public Selection(){
		
	}
public static void SelectionSort(int[]S){
	
	for(int i=0;i<S.length;i++){
		int index=i;
		int maxvalue =S[i];
		for(int j=i + 1;j<S.length;j++){
			if(maxvalue > S[j]){
				maxvalue = S[j];
				index = j;
			}
			
		}
		S[index] = S[i];
		S[i] = maxvalue;
	}
	
	 for(int p=0;p<S.length;p++)
			System.out.print(S[p]+",");	
	
}
}