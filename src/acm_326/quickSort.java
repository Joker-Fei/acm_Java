package acm_326;

public class quickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[]A={6,5,4,3,3,2,1,0,0};
		if(A.length>0){
			
			sort(A,0,A.length-1);
		}
		System.out.println("排序之后：");
		for(int i=0;i<A.length-1;i++){
			 System.out.print(A[i]+" ");
			
		}
	}
	public static int[] sort(int[]A,int lo,int hi){
		if(lo<hi){
			int mid=quick(A,lo,hi);
			sort(A,lo,mid);
			sort(A,mid+1,hi);
		}
		return A;
	}
	private static int quick(int[] A, int lo, int hi) {
		int temp=A[lo];
		while(lo<hi){
			while(lo<hi && temp<=A[hi]){
				hi--;
			}
			A[lo]=A[hi];
			while(lo<hi && temp>=A[lo]){
				lo++;
			}
			A[hi]=A[lo];
		}
		A[lo]=temp;
		return hi;
	}

}
