package acm_326;

public class chaRuSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]A={6,6,5,4,3,2,1,0,0,0};

		for(int i=1;i<A.length;i++){
			int j;
			int temp=A[i];
			for(j=i-1;j>=0;j--){
				if(A[j]>temp){
					A[j+1]=A[j];
				}else{
					break;
				}
			}
			A[j+1]=temp;
		}
		for(int i=0;i<A.length;i++){
			System.out.print (A[i]+" ");
		}
	}
	

}
